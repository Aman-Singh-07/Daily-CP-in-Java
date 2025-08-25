// https://leetcode.com/problems/diagonal-traverse/description/?envType=daily-question&envId=2025-08-25

import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat){
        int m = mat.length, n = mat[0].length;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key=i+j;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(mat[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int k=0;k<=m+n-2;k++){
            List<Integer> diag=diagonals.get(k);
            if(k%2==0){
                Collections.reverse(diag);
            }
            result.addAll(diag);
        }
        int[] output=new int[result.size()];
        for(int i=0;i<result.size();i++){
            output[i]=result.get(i);
        }

        return output;
    }
}
