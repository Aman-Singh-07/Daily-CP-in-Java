// https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?page=5&sortBy=submissions

class Solution {
    public boolean hasTripletSum(int arr[], int target){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==target) return true;
                else if(sum<target) l++;
                else r--;
            }
        }
        return false;
    }
}
