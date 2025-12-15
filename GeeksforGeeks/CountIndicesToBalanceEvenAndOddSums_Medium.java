// https://www.geeksforgeeks.org/problems/count-indices-to-balance-even-and-odd-sums/1

class Solution {
    public int cntWays(int[] arr) {
        // code here
        int count=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) sum1+=arr[i];
            else sum2+=arr[i];
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0) sum1-=arr[i];
            else sum2-=arr[i];
            
            if(sumEven+sum2==sumOdd+sum1) count++;
            if(i%2==0) sumEven+=arr[i];
            else sumOdd+=arr[i];
        }
        return count;
    }
}
