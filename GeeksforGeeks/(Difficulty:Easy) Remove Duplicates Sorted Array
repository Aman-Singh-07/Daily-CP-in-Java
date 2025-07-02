// https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?page=5&sortBy=submissions

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=0;
                count++;
            }
        }
        int k=0;
        int i=0;
        while(k<arr.length && i<arr.length){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
            i++;
        }
        return k;
    }
}
