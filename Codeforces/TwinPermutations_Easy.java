// https://codeforces.com/problemset/problem/1831/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int[] brr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                brr[i]=n+1-arr[i];
            }
            for(int num:brr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
