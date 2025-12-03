// https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int secondMax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        if(max==secondMax) return -1;
        return secondMax;
    }
}
