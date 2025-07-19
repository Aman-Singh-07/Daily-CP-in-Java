// https://www.geeksforgeeks.org/problems/peak-element/1?page=1&sortBy=submissions

class Solution {

    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        if(arr.length==1) return 0;
        if(arr.length==2){
            if(arr[0]>arr[1]) return 0;
            else return 1;
        }
        for(int i=1;i<(n-1);i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                return i;
            }
        }
        if(arr[n-1]>arr[n-2]) return n-1;
        return -1;
    }
}
