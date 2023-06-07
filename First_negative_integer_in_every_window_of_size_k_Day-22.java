// Problem :- https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

// Solution :- 

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> ans=new ArrayList<>();
        Queue<Long> q=new ArrayDeque<>();
        int left=0,right=K-1;
        for(int i=left;i<right;i++){
            if(A[i]<0){
                q.add(A[i]);
            }
        }
        
        while(right<N){
            if(left>0 && A[left-1]<0){
                q.remove();
            }
            if(A[right]<0){
                q.add(A[right]);
            }
            left++;right++;
            if(q.size()==0){
                ans.add((long)0);
            }else{
                ans.add(q.peek());
            }
        }
        long arr[]=new long[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
        
    }
}
