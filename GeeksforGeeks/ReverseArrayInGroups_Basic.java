// https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=4&sortBy=submissions

class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        for(int i=0;i<arr.length;i+=k){
            int left=i,right=Math.min(i+k-1,arr.length-1);
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
}
