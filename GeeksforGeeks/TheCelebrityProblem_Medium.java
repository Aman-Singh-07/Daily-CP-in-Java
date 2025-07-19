// https://www.geeksforgeeks.org/problems/the-celebrity-problem/1?page=2&difficulty=Medium,Hard&status=unsolved&sortBy=submissions

class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int candidate=0;
        for(int i=0;i<mat.length;i++){
            if(mat[candidate][i]==1){
                candidate=i;
            }
        }
        for(int i=0;i<mat.length;i++){
            if(candidate==i) continue;
            if(mat[candidate][i]==1 || mat[i][candidate]==0) return -1;
        }
        return candidate;
    }
}
