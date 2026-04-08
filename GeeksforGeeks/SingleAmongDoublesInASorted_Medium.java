// https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1?page=9&status=unsolved&sortBy=submissions

class Solution {
    int single(int[] arr) {
        // code here
        
        int last=arr[0];
        int sum=arr[0];
        int doubleSum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==last){
                doubleSum+=arr[i];
            }else{
                last=arr[i];
                sum+=arr[i];
                doubleSum+=arr[i];
            }
        }
        return sum*2-doubleSum;
    }
}
