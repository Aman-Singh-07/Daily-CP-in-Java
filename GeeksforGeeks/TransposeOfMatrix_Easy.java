// https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> l=new ArrayList<>();
            for(int j=0;j<mat[0].length;j++){
                l.add(mat[j][i]);
            }
            list.add(l);
        }
        return list;
    }
}
