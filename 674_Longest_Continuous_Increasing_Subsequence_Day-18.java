// Problem :- https://leetcode.com/problems/longest-continuous-increasing-subsequence

// Solution :-

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
        }
        return max+1;
    }
}
