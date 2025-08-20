// https://www.geeksforgeeks.org/problems/search-in-fully-rotated-sorted-2d-matrix/1

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        for(int num:list){
            if(num==x){
                return true;
            }
        }
        return false;
    }
}
