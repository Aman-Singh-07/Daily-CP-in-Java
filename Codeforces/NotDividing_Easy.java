// https://codeforces.com/contest/1794/problem/B

import java.util.*;
public class Solution {
       public static void main(String[] args) {
        Scanner fs=new Scanner(System.in);
        int t=fs.nextInt();
        while(t-->0){ 
            int n =fs.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=fs.nextInt(); 
            for(int i =0;i<n;i++){
                if(a[i]==1) a[i]=2;
            }
            for(int i =0;i<n-1;i++){
                if(a[i+1]%a[i]==0) a[i+1]+=1;
                
            }
            for(int i =0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
} 
