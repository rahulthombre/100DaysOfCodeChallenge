// Problem :- https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

// Solution :-

class Solution {
    public String removeDuplicates(String s) {
        int i=0,n=s.length();
        char arr[]=s.toCharArray();
        for(int j=0;j<n;++j,++i){
            arr[i]=arr[j];
            if(i>0 && arr[i-1]==arr[i]){
                i-=2;
            }
        }
        return new String(arr,0,i);
    }
}
