// https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=2&sortBy=submissions

class Solution {
    public int maxWater(int arr[]) {
        // code here
        int max1=arr[0];
        int[] arr1=new int[arr.length];
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
            arr1[i]=max1;
        }
        int max2=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max2){
                max2=arr[i];
            }
            arr2[i]=max2;
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            res+=Math.min(arr1[i],arr2[i])-arr[i];
        }
        return res;
        
    }
}
