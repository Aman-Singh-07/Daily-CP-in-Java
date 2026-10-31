// https://www.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1

class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        // code here
        int sum=0;
        int max=0;
        for(int i=0;i<Math.min(totalTime,arr.length);i++){
            sum+=arr[i];
        }
        max=sum;
        int i=0;
        int j=totalTime;
        while(j<arr.length){
            sum-=arr[i++];
            sum+=arr[j++];
            max=Math.max(max,sum);
        }
        
        return max;
        
    }
}
