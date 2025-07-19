// https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&difficulty=Medium&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
        for(int i=0;i<d/2;i++){
            int temp=arr[i];
            arr[i]=arr[d-i-1];
            arr[d-i-1]=temp;
        }
        for(int i=d;i<(n+d)/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-(i-d)];
            arr[n-1-(i-d)]=temp;
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
}
