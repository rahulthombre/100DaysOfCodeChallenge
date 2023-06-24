// Problem :- https://leetcode.com/problems/container-with-most-water

// Solution :-

class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int n=height.length;
        int left=0, right=n-1;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            water=Math.max(water,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return water;
    }
}
