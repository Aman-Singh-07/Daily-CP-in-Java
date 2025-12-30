// https://www.geeksforgeeks.org/problems/search-in-a-matrix--021840/0?page=7&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==x) return true;
            }
        }
        return false;
    }
}
