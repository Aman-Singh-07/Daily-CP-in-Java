// https://www.geeksforgeeks.org/problems/determinant-of-a-matrix-1587115620/1

class Solution {
    // Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n) {
        // code here
        if(n==1) return matrix[0][0];
        if(n==2) return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
        int det=0;
        int sign=1;
        for(int i=0;i<n;i++){
            int[][] subMatrix=getCofactor(matrix,0,i,n);
            det+=sign*matrix[0][i]*determinantOfMatrix(subMatrix,n-1);
            sign=-sign;
        }
        return det;
    }
    
    public static int[][] getCofactor(int[][] matrix,int p,int q, int n){
        int[][] temp=new int[n-1][n-1];
        int iTemp=0,jTemp;
        for(int i=0;i<n;i++){
            if(i==p) continue;
            jTemp=0;
            for(int j=0;j<n;j++){
                if(j==q) continue;
                temp[iTemp][jTemp++]=matrix[i][j];
            }
            iTemp++;
        }
        return temp;
    }
}
