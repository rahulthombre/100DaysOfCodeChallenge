// Problem :- https://leetcode.com/problems/rotate-string

// Solution 1 :-

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

// Solution 2 :-
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        for(int i=0;i<s.length();i++){
            String left=s.substring(i,s.length());
            String right=s.substring(0,i);
            if((left+right).equals(goal)==true){
                return true;
            }
        }
        return false;
    }
}
