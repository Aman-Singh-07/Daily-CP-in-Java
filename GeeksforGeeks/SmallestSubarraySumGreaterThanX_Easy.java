// https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1

class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>x){
                min=Math.min(min,j-i+1);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
