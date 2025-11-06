// https://www.geeksforgeeks.org/problems/shortest-un-ordered-subarray3634/1?page=1&status=unsolved&sortBy=difficulty

// User function Template for Java

class Solution {

    public int shortestUnorderedSubarray(int arr[]) {
        if(arr.length==1) return 0;
        if(arr.length==2){
            if(arr[1]<arr[0]) return 2;
        }
        else{
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]) return 3;
            }
        }
        return 0;
    }
}
