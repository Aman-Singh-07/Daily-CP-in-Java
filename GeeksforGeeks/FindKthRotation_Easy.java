// https://www.geeksforgeeks.org/problems/rotation4723/1?page=6&sortBy=submissions

class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            return i;
        }
        return 0;
        
    }
    
}
