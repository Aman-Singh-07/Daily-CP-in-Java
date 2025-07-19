// https://www.geeksforgeeks.org/problems/square-root/1?page=1&category=Mathematical,Bit%20Magic&status=unsolved&sortBy=submissions

/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        // Your code here
        if(n==0 || n==1) return n;
        return sqrt(n);
    }
    
    public static int sqrt(int n){
        int left=0;
        int right=n;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long) mid*mid==n) return mid;
            else if((long) mid*mid<n){
                ans=mid;
                left=mid+1;
            }
            else right=mid-1;
        }
        return ans;
    }
}
