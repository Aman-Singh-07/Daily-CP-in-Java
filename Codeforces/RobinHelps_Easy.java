// https://codeforces.com/problemset/problem/2014/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int sum=0;
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0 && sum>0){
                    sum--;
                    count++;
                }
                if(arr[i]>=k){
                    sum+=arr[i];
                    arr[i]=0;
                }
            }
            System.out.println(count);
        }
    }
}
