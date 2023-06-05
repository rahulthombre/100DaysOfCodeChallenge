// Problem :- https://leetcode.com/problems/longest-substring-without-repeating-characters

// Solution :-

class Solution {
  
    public int lengthOfLongestSubstring(String str) {
      HashMap<Character, Integer> hm=new HashMap<>();
        int ans=0,right=0,left=0;
        while(right<str.length()){
            char ch=str.charAt(right);
            int last=hm.getOrDefault(ch,-1);
            if(last>=left){
                left=last+1;
            }
            hm.put(ch,right);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
