// https://codeforces.com/problemset/problem/2121/A

import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int s=input.nextInt();
            int[] x=new int[n];
            for(int i=0;i<n;i++){
                x[i]=input.nextInt();
            }
            if(n==1) System.out.println(Math.abs(s-x[0]));
            else System.out.println(Math.min(Math.abs(s-x[0])+(x[n-1]-x[0]),Math.abs(x[n-1]-s)+(x[n-1]-x[0])));
        }
    }
}
