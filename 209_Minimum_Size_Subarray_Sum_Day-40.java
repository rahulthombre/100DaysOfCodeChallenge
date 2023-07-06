// Problem :- https://leetcode.com/problems/minimum-size-subarray-sum

// Solution :-

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                sum=sum-nums[i];
                min=Math.min(j-i+1,min);
                i++;
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
