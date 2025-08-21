// https://www.geeksforgeeks.org/problems/maximize-the-minimum-difference-between-k-elements/1

class Solution {
    public int maxMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int low=0;
        int high=arr[arr.length-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;      
                low=mid+1;   
            }else{
                high=mid-1;  
            }
        }

        return ans;
    }
    public boolean isPossible(int[] arr,int k,int minDiff){
        int count=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=minDiff){
                count++;
                last=arr[i];
            }
            if(count==k) return true;
        }

        return false;
    }
}
