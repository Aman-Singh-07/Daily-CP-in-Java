// https://codeforces.com/problemset/problem/1360/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                min=Math.min(min,arr[i+1]-arr[i]);
            }
            System.out.println(min);
        }
    }
}
