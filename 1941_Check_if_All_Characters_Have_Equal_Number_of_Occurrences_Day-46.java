// Problem :- https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences

// Solution :-

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int countemp=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    countemp++;
                }
            }
            if(i==0){
                count=countemp;
            }
            if(count!=countemp){
                return false;
            }
        }
        return true;
    }
}
