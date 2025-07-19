// https://codeforces.com/problemset/problem/151/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int l=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int p=input.nextInt();
        int nl=input.nextInt();
        int np=input.nextInt();
        int x=(k*l)/nl;
        int y=c*d;
        int z=p/np;
        System.out.println(Math.min(x,Math.min(y,z))/n);
    }
        
}
