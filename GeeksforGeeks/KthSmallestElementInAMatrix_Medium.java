//  https://www.geeksforgeeks.org/problems/kth-element-in-matrix/1

class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
}
