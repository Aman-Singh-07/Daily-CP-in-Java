// https://www.geeksforgeeks.org/problems/2-d-difference-array/1

class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int[] arr:opr){
            int val=arr[0];
            int r1=arr[1];
            int r2=arr[3];
            int c1=arr[2];
            int c2=arr[4];
            for(int i=r1;i<=r2;i++){
                for(int j=c1;j<=c2;j++){
                    mat[i][j]+=val;
                }
            }
        }
        
        for(int[] arr:mat){
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(arr[i]);
            }
            list.add(l);
        }
        
        return list;
    }
}
