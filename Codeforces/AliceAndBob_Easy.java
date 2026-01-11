// https://codeforces.com/contest/2169/problem/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long a=input.nextLong();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            int less=0;
            int more=n;
            for(int i=0;i<n;i++){
                if(arr[i]<a){
                    less++;
                }
                if(arr[i]==a){
                    more--;
                }
            }
            more-=less;
            System.out.println((less>=more)?a-1:a+1);
        }
    }
}
