// https://www.geeksforgeeks.org/problems/count-pairs-sum-in-matrices4332/1
class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n=mat1.length;
        HashSet<Integer> i2=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                i2.add(mat2[i][j]);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a=mat1[i][j];
                int b=x-a;
                if(i2.contains(b)){
                    count++;
                }
            }
        }
        return count;
    }
}
