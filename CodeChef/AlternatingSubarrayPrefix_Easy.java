// https://www.codechef.com/problems/ALTARAY?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = input.nextInt();
            }
            int[] dp = new int[n];
            dp[n-1] = 1;
            for(int i=n-2; i>=0; i--){
                if((arr[i] < 0 && arr[i+1] > 0) || (arr[i] > 0 && arr[i+1] < 0)){
                    dp[i] = 1 + dp[i+1];
                } else {
                    dp[i] = 1;
                }
            }
            for(int i=0; i<n; i++){
                System.out.print(dp[i] + " ");
            }
            System.out.println();
        }
    }
}
