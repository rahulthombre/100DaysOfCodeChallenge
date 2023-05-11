//Problem :- https://leetcode.com/problems/koko-eating-bananas/submissions/948484995/

//Solution :-
class Solution {
    public boolean isPossible (int[] piles, int h,int speed){
        long time=0;
        for(int i=0;i<piles.length;i++){
            time+=(piles[i]/speed);
            if(piles[i]%speed!=0){
                time++;
            }
        }
        return (time<=h);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1,right=(int)1e9;
        int ans=right;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
