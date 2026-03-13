// https://codeforces.com/problemset/problem/2158/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int y=input.nextInt();
            int r=input.nextInt();
            int x=n;
            x-=r;
            x-=(y/2);
            System.out.println((x>=0)?n-x:n);
        }
    }
}
