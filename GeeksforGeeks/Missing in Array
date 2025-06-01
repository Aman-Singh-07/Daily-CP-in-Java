// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions

class Solution {
    int missingNum(int arr[]) {
        // code here
        long max=0;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        long expectedSum=max*(max+1)/2;
        long diff=expectedSum-sum;
        return diff==0?(int)max+1:(int)diff;
    }
}
