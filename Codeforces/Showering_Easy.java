// https://codeforces.com/problemset/problem/1999/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int s=input.nextInt();
            int m=input.nextInt();
            int sum=0;
            int[][] arr=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=input.nextInt();
                arr[i][1]=input.nextInt();
            }
            if(arr[0][0]>=s || m-arr[n-1][1]>=s) System.out.println("YES");
            else{
                boolean isTrue=false;
                for(int i=1;i<n;i++){
                    if(arr[i][0]-arr[i-1][1]>=s){
                        isTrue=true;
                        break;
                    }
                }
                System.out.println(isTrue?"YES":"NO");
            }
        }
    }
}
