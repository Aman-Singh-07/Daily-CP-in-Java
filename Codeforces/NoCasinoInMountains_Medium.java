// https://codeforces.com/contest/2126/problem/B

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
            int count=0;
            int res=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    res++;
                }
                else{
                    res=0;
                }
                if(res==k){
                    count++;
                    res=0;
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
