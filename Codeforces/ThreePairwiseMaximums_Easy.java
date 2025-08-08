// https://codeforces.com/problemset/problem/1385/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long x=input.nextLong();
            long y=input.nextLong();
            long z=input.nextLong();
            long a=Math.min(x,y);
            long b=Math.min(x,z);
            long c=Math.min(y,z);
            if(Math.max(a,b)==x && Math.max(a,c)==y && Math.max(b,c)==z){
                System.out.println("YES");
                System.out.println(a+" "+b+" "+c);
            }
            else System.out.println("NO");
        }
    }
}
