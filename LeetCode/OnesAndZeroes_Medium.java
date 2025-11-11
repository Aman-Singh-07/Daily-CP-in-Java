// https://leetcode.com/problems/ones-and-zeroes/description/?envType=daily-question&envId=2025-11-11

class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] arr=new int[m+1][n+1];
        for(String s:strs){
            int count0=0,count1=0;
            for(char ch:s.toCharArray()){
                if(ch=='0') count0++;
                else count1++;
            }
            for(int i=m;i>=count0;i--){
                for(int j=n;j>=count1;j--){
                    arr[i][j]=Math.max(arr[i][j],1+arr[i-count0][j-count1]);
                }
            }
        }
        return arr[m][n];
    }
}
