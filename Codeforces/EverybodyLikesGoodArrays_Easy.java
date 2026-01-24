// https://codeforces.com/problemset/problem/1777/A


import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            long res=0;
            for(int i=0;i<n-1;i++){
                if((arr[i]%2==0 && arr[i+1]%2==0) || (arr[i]%2!=0 && arr[i+1]%2!=0)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
