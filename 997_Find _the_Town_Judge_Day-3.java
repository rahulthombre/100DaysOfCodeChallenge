//Problem :- https://leetcode.com/problems/find-the-town-judge/

//Solution :-

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outgoing=new int[n+1];
        int[] incoming=new int[n+1];

        for(int row=0;row<trust.length;row++){
            int a=trust[row][0];
            int b=trust[row][1];
            outgoing[a]++;
            incoming[b]++;
        }

        for(int p=1;p<=n;p++){
            if(outgoing[p]==0 && incoming[p]==n-1){
                return p;
            }
        }
        return -1;
    }
}
