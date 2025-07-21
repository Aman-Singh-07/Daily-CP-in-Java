// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?page=4&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int min=arr.get(arr.size()-1);
        for(int i=0;i+m-1<arr.size();i++){
            min=Math.min(arr.get(i+m-1)-arr.get(i),min);
        }
        return min;
    }
}
