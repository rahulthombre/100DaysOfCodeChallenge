// Problem :- https://leetcode.com/problems/flipping-an-image

// Solution :- 

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] mat=new int[image.length][image[0].length];
   
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==1){
                    mat[i][image.length-j-1]=0;
                }else{
                    mat[i][image.length-j-1]=1;
                }
            }
        }
        return mat;
    }
}
