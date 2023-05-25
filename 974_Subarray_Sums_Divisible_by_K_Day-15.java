// Problem :-  https://leetcode.com/problems/subarray-sums-divisible-by-k

// Solution :-

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq=new int[k];
        freq[0]=1;

        int prefixSum=0,subArray=0;
        for(int i:nums){
            prefixSum+=i;
            int mod=prefixSum%k;
            if(mod<0){
                mod+=k;
            }
            subArray+=freq[mod]++;
        }
        return subArray;
    }
}
