// Problem :- https://leetcode.com/problems/evaluate-reverse-polish-notation

// Solution :- 

class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> stk=new Stack<>();
        for(String str:arr){
            if(str.equals("+")){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a+b);
            }else if(str.equals("-")){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a-b);
            }else if(str.equals("/")){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a/b);
            }else if(str.equals("*")){
                int b=stk.pop();
                int a=stk.pop();
                stk.push(a*b);
            }else{
                int val=Integer.parseInt(str);
                stk.push(val);
            }
        }
        return stk.peek();
    }
}
