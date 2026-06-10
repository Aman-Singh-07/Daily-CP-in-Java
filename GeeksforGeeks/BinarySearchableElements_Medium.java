// https://www.geeksforgeeks.org/problems/binary-searchable-elements/1

class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=arr.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(arr[mid]==arr[i]){
                    count++;
                    break;
                }
                else if(arr[mid]>arr[i]) r=mid-1;
                else l=mid+1;
            }
        }
        return count;
    }
};
