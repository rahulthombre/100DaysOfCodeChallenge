// Problem :- https://leetcode.com/problems/find-all-duplicates-in-an-array

// Solution :-

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                l.add(nums[i]);
            }
        }
        return l;
    }
}
