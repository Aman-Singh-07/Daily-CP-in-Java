// https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?page=5&status=unsolved&sortBy=submissions
 
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==x) return true;
            }
        }
        return false;
    }
}
