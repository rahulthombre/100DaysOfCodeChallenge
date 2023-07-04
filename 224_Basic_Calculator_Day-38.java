// Problem :- https://leetcode.com/problems/basic-calculator

// Solution :-

class Solution {
    public int calculate(String s) {
        int n=s.length();
        int sign=1,sum=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int currNo=ch-'0';
                while(i+1<n && Character.isDigit(s.charAt(i+1))){
                    currNo=currNo*10+s.charAt(i+1)-'0';
                    i++;
                }
                currNo*=sign;
                sum+=currNo;
                sign=1;
            }else if(ch=='+'){
                sign=1;
            }else if(ch=='-'){
                sign=-1;
            }else if(ch=='('){
                stack.push(sum);
                stack.push(sign);
                sum=0;
                sign=1;
            }else if(ch==')'){
                sum*=stack.pop();
                sum+=stack.pop();
            }
        }
        return sum;
    }
}
