// https://www.geeksforgeeks.org/problems/max-xor-subarray-of-size-k/1

class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int max=0;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];
        }
        for(int i=0;i<=arr.length-k;i++){
            int j=i+k-1;
            int xor=0;
            if(i==0) xor=prefix[j];
            else xor=prefix[j]^prefix[i-1];
            max=Math.max(max,xor);
        }
        return max;
    }
}
