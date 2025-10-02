// https://codeforces.com/problemset/problem/337/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(); 
        int m=input.nextInt(); 
        int[] arr=new int[m];  
        for(int i=0;i<m;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=m-n;i++){
            min=Math.min(arr[i+n-1]-arr[i],min);
        }
        System.out.println(min);
    }
}
