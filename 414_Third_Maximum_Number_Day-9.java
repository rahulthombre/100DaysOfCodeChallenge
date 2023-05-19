// Problem :- https://leetcode.com/problems/third-maximum-number/description/

// Solutin :-

class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max || nums[i]==smax || nums[i]==tmax){
                continue;
            }
            if(nums[i]>=max){
                tmax=smax;
                smax=max;
                max=nums[i];
            }else if(nums[i]<max && smax<=nums[i]){
                tmax=smax;
                smax=nums[i];
            }else if(nums[i]<max && tmax<=nums[i]){
                tmax=nums[i];
            }
        }
        if(tmax!= Long.MIN_VALUE){
            return (int)tmax;
        }else if(max!=Long.MIN_VALUE){
            return (int)max;
        }else{
            return (int)smax;
        }
    
    }
}
