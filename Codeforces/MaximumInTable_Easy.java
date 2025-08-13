// https://codeforces.com/problemset/problem/509/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[][] arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i==1){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        System.out.println(arr[n][n]);
    }
}
