// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&sortBy=submissions

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int j=count0;j<count1+count0;j++){
            arr[j]=1;
        }
        for(int k=count1+count0;k<arr.length;k++){
            arr[k]=2;
        }
    }
    
}
