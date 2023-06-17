// Problem :- https://leetcode.com/problems/move-zeroes

// Solution :- 

class Solution {
    public void moveZeroes(int[] nums) {
      int k = 0;
      int n = nums.length;
      while (k < n){
        if (nums[k] == 0){
          break;
        }else{
          k = k + 1;
        }
      }

      int i = k, j = k + 1;
      while (i < n && j < n){
        if (nums[j] != 0){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
        }
        j++;
      }
    }
}
