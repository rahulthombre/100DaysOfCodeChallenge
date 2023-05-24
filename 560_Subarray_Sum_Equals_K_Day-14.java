// Problem :- https://leetcode.com/problems/subarray-sum-equals-k

// Solution :- TC - O(n^2) SC - O(1)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
               sum+=nums[j];
               if(sum==k){
                   count++;
               }
            }
        }
        return count;
    }
}
