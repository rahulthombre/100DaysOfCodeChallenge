// Problem :- https://leetcode.com/problems/merge-strings-alternately

// Solution :-

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0,j=0;
        String ans=new String();
        while(i<n || j<m){
            if(i<n){
                ans=ans+word1.charAt(i++);
            }
            if(j<m){
                ans=ans+word2.charAt(j++);
            }

        }
        return ans;
    }
}
