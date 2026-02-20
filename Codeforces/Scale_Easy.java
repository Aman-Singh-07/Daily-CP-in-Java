// https://codeforces.com/problemset/problem/1996/B

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            String[] grid=new String[n];
            for(int i=0;i<n;i++){
                grid[i]=input.next();
            }for(int i=0;i<n;i+=k){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j+=k){
                    sb.append(grid[i].charAt(j));
                }
                System.out.println(sb.toString());
            }
        }
    }
}
