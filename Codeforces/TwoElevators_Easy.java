// https://codeforces.com/problemset/problem/1729/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
           int a=input.nextInt();
           int b=input.nextInt();
           int c=input.nextInt();
           int t1=Math.abs(a-1);
           int t2=Math.abs(b-c)+Math.abs(c-1);
           System.out.println((t1<t2)?1:(t1>t2)?2:3);
        }
    }
}
