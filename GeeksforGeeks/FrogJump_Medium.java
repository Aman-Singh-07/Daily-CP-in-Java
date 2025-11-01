// https://www.geeksforgeeks.org/problems/geek-jump/1?page=7&status=unsolved&sortBy=submissions

class Solution {
    int minCost(int[] height){
        int n=height.length;
        if(n==0) return 0;
        if(n==1) return 0;
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=Math.abs(height[1]-height[0]);
        for(int i=2;i<n;i++){
            int oneStep=arr[i-1]+Math.abs(height[i]-height[i-1]);
            int twoStep=arr[i-2]+Math.abs(height[i]-height[i-2]);
            arr[i]=Math.min(oneStep, twoStep);
        }
        return arr[n-1];
    }
}
