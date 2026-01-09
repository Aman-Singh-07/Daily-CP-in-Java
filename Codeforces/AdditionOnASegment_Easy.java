// https://codeforces.com/contest/2170/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            long sum=0;
            long count0=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                sum+=arr[i];
                if(arr[i]==0) count0++;
            }
            System.out.println(Math.min(n-count0,sum-n+1));
            
        }
    }
}
