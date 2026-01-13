// https://leetcode.com/problems/spiral-matrix-ii/description/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int j=1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr[top][i]=j++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=j++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=j++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=j++;
                }
                left++;
            }
        }
        return arr;
    }
}
