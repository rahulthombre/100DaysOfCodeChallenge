// Problem :- https://leetcode.com/problems/missing-number

// Solution :-

class Solution {
    public int missingNumber(int[] nums) {
       int expectedSum=0;
       int sum=0;
       int n=nums.length;
       for(int i=0;i<=n;i++){
           expectedSum+=i;
       }
       for(int num:nums){
           sum+=num;
       }

       int missing=expectedSum-sum;
       return missing;
    }
}
