// https://www.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr=new int[n];
        if(n==1) return arr;
        int a=0;
        int b=1;
        arr[0]=a;
        arr[1]=b;
        for(int i=2;i<n;i++){
            arr[i]=a+b;
            a=b;
            b=arr[i];
        }
        return arr;
    }
}
