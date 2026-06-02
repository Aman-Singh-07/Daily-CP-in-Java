// https://www.geeksforgeeks.org/problems/pairs-with-specific-difference1533/1

class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int sum=0;
        int i=arr.length-1;
        int j=arr.length-2;
        while(j>=0){
            if(arr[i]-arr[j]<k){
                sum+=arr[i]+arr[j];
                j-=2;
                i-=2;
            }else{
                i--;
                j--;
            }
        }
        return sum;
    }
}
