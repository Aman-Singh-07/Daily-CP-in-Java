// https://www.geeksforgeeks.org/problems/modify-array-to-maximize-sum-of-adjacent-differences1729/1

class Solution {
    public int maxDiffSum(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1) return 0;
        int temp1=0;
        int temp2=0;
        for(int i=1;i<n;i++){
            int req1=Math.max(temp1+Math.abs(arr[i]-arr[i-1]),temp2+Math.abs(arr[i]-1));
            int req2=Math.max(temp1+Math.abs(1-arr[i-1]),temp2);
            temp1=req1;
            temp2=req2;
        }
        return Math.max(temp2,temp1);
        
        
    }
}
