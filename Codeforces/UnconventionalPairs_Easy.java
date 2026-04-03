// https://codeforces.com/problemset/problem/2149/B

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=input.nextInt();
            Arrays.sort(arr);
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n-1;i+=2){
                max=Math.max(arr[i+1]-arr[i],max);
            }
            System.out.println(max);
        }
    }
}
