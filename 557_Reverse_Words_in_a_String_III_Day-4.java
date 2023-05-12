// Problem :- https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

//Solution :-

class Solution {
    public String reverse(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        String res="";
        for(int i=0;i<words.length;i++){
            res+=reverse(words[i]);
            if(i<words.length-1){
                res+=" ";
            }
        }
        return res;

    }
}
