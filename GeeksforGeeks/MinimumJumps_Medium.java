// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&status=unsolved&sortBy=submissions

class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n<1) return 0;
        if(arr[0]==0) return -1;
        else if(arr[0]!=0 && n==1) return 1;
        int jumps=1;             
        int max=arr[0];      
        int steps=arr[0];         
        for(int i=1;i<n;i++){
            if (i==n-1) return jumps; 
            max=Math.max(max,i+arr[i]);
            steps--;
            if(steps==0){       
                jumps++;
                if(i>=max) return -1;
                steps=max-i;
            }
        }
        return -1;
    }
}
