// https://www.geeksforgeeks.org/problems/reversal-algorithm5340/1?page=10&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-1-d);
        reverse(arr,arr.length-d,arr.length-1);
        
    }
    
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
