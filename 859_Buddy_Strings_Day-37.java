// Problem :- https://leetcode.com/problems/buddy-strings

// Solution :-

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(n!=m){
            return false;
        }
        int diff=0;
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(int i=0;i<m;++i){
            int a=s.charAt(i),b=goal.charAt(i);
            ++count1[a-'a'];
            ++count2[b-'a'];
            if(a!=b){
                ++diff;
            }
        }
        boolean f=false;
        for(int i=0;i<26;++i){
            if(count1[i]!=count2[i]){
                return false;
            }
            if(count1[i]>1){
                f=true;
            }
        }
        return diff==2 || (diff==0 && f);
    }
}
