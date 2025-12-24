// https://www.geeksforgeeks.org/problems/quick-sort/1

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int i=low-1;
        int j=low;
        int k=high;
        while(j<high){
            if(arr[j]<=arr[k]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
