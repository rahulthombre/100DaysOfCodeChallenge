// Problem :-  https://leetcode.com/problems/kth-largest-element-in-an-array/description/

// Solution :-  time complexity - O(nlogn)

class Solution {
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums);
       int i;
       for(i=0;i<nums.length-k;i++){

       }
       return nums[i];
    }
}
