// https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
 
class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int min=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.min(arr[i],sum+arr[i]);
            min=Math.min(min,sum);
        }
        return min;
    }
}
