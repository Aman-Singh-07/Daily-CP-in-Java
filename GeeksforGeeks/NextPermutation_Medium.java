// https://www.geeksforgeeks.org/problems/next-permutation5226/1?page=4&difficulty=Medium&status=unsolved&sortBy=submissions

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int index1=-1;
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index1=i-1;
                break;
            }
        }
        if(index1==-1){
            reverse(arr,0,n-1);
            return;
        }
        int index2=-1;
        for(int i=n-1;i>index1;i--){
            if(arr[i]>arr[index1]){
                index2=i;
                break;
            }
        }
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        reverse(arr,index1+1,n-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
}
