// https://codeforces.com/contest/2165/problem/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                max=Math.max(arr[i],max);
            }
            long res=0;
            for(int i=1;i<n;i++){
                res+=Math.max(arr[i-1],arr[i]);
            }
            res+=Math.max(arr[0],arr[n-1]);
            System.out.println(res-max);
            
        }
    }
}
