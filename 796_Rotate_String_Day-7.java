// Problem :- https://leetcode.com/problems/rotate-string

// Solution :-

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        String s2=s+s;
        return (s2.contains(goal));
    }
}
