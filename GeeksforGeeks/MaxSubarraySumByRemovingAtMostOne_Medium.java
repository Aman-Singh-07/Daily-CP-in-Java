// https://www.geeksforgeeks.org/problems/max-sum-subarray-by-removing-at-most-one-element/1

class Solution {
    public int maxSumSubarray(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int noSkip=arr[0];
        int oneSkip=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<n;i++){
            int nextOneSkip=Math.max(noSkip, oneSkip + arr[i]);
            int nextNoSkip=Math.max(arr[i], noSkip + arr[i]);

            noSkip = nextNoSkip;
            oneSkip = nextOneSkip;

            maxSum = Math.max(maxSum, Math.max(noSkip, oneSkip));
        }

        return maxSum;
    }
}
