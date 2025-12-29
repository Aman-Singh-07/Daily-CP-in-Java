//  https://www.geeksforgeeks.org/problems/kth-missing-positive-number-in-a-sorted-array/1

class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        for(int i=0;i<arr.length;i++){
            int res=arr[i]-(i+1);
            if(res>=k){
                return k+i;
            }
        }
        return k+arr.length;
    }
}
