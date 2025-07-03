// https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&status=unsolved&sortBy=submissions

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int current=0;
        for(int i=0;i<arr.length;i++){
            if(current==sum-current-arr[i]){
                return i;
            }
            current+=arr[i];
        }
        return -1;
    }
}
