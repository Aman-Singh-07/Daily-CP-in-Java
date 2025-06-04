// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&sortBy=submissions

class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(k==arr[mid]){
                result=mid;
                right=mid-1;
            }
            else if(k>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    }
}
