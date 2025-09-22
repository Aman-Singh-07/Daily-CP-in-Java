// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[k]=arr[i];
                k++;
            }
        }
        while(k<arr.length){
            arr[k]=1;
            k++;
        }
    }
}
