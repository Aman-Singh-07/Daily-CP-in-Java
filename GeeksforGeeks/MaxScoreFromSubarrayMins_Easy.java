// https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/1

class Solution {
    public int maxSum(int arr[]) {
        // code here
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(max,arr[i]+arr[i+1]);
        }
        return max;
    }
}
