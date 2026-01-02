// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=-1;
        int j=0;
        while(j<arr.length){
            if(arr[j]<1){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }
        j=i+1;
        while(j<arr.length){
            if(arr[j]<2){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }
        
    }
}
