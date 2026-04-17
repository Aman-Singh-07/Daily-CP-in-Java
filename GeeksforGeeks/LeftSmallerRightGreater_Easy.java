// https://www.geeksforgeeks.org/problems/unsorted-array4925/1?page=5&status=unsolved&sortBy=submissions

class Solution {
    public int findElement(int[] arr) {
        // code here
        int[] a=new int[arr.length];
        int[] b=new int[arr.length];
        int min=arr[arr.length-1];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            a[i]=max;
        }
        for(int i=arr.length-1;i>=0;i--){
            min=Math.min(min,arr[i]);
            b[i]=min;
        }
        for(int i=1;i<arr.length-1;i++){
            if(a[i]==b[i]) return a[i];
        }
        return -1;
    }
}
