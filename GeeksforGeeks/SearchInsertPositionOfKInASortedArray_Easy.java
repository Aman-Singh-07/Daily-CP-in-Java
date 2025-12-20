//  https://www.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1

class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=k) return i;
        }
        return arr.length;
    }
};
