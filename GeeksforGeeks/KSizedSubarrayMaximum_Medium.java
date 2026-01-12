// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        for(int i=0;i<n;i++){
            if(i%k==0) left[i]=arr[i];
            else left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1 || (i+1)%k==0) right[i]=arr[i];
            else right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i<=n-k;i++){
            list.add(Math.max(right[i],left[i+k-1]));
        }
        return list;
        
    }
}
