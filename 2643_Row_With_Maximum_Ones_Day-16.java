// Problem :- https://leetcode.com/problems/row-with-maximum-ones

// Solution :-

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int a=0;
        int[] ans=new int[2];
        int msum=0;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                   sum+=1;
                }
                if(sum>msum){
                    msum=sum;
                    row=i;
                }
            }
        }
        ans[0]=row;
        ans[1]=msum;
        return ans;

    }
}
