// https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1

class Solution {
    public List<Integer> exitPoint(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int r=0, c=0;
        int dir=0; 
    
        int prevR=0,prevC=0;
        
        while(r>=0 && r<n && c>=0 && c<m){
            prevR=r;
            prevC=c;
            
            if(mat[r][c]==1){
                dir=(dir+1)%4;
                mat[r][c]=0;       
            }
            
            r+=dr[dir];
            c+=dc[dir];
        }
        
        return Arrays.asList(prevR,prevC);
    }
}
