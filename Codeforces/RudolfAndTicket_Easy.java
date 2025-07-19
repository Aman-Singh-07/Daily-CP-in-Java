// https://codeforces.com/problemset/problem/1941/A

import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            int k=input.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=input.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((a[i]+b[j])<=k) count++;
                }
            }
            System.out.println(count);
        }
    }
}
