// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?page=5&status=unsolved&sortBy=submissions

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
}
