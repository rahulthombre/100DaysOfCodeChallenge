// Problem :- https://leetcode.com/problems/median-of-two-sorted-arrays/description/

// Solution :-

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int[] newArray=new int[n+m];
       int i=0,j=0,k=0;
       while(i<=n && j<=m){
           if(i==n){
               while(j<m){
                   newArray[k++]=nums2[j++];            
               }
               break;
           }else if(j==m){
               while(i<n){
                   newArray[k++]=nums1[i++];    
               }
               break;
           }
           if(nums1[i]<nums2[j]){
               newArray[k++]=nums1[i++];
           }else{
               newArray[k++]=nums2[j++];
           }
       }
       if((n+m)%2==0){
           return (float)(newArray[(n+m)/2-1]+newArray[(n+m)/2])/2;
       }else {
           return newArray[(n+m)/2];
       }
    }
    
}
