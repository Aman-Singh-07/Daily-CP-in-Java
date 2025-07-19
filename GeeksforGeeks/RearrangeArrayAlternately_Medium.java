// https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1?page=3&difficulty=Medium&status=unsolved&sortBy=submissions

class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
        int start=0,end=n-1;
        for(int i=0;i< n;i++){
            if(i%2==0){
                arr[i]=a[end--];
            }else{
                arr[i]=a[start++];
            }
        }
    }
}
