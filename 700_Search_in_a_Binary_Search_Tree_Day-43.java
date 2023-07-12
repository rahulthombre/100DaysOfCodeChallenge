// Problem :- https://leetcode.com/problems/search-in-a-binary-search-tree

// Solution :- 

class Solution {
    public TreeNode searchBST(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        if(root.val==target){
            return root;
        }else if(root.val>target){
            return searchBST(root.left,target);
        }else{
            return searchBST(root.right,target);
        }
    }
}
