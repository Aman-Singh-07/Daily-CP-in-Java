// https://codeforces.com/problemset/problem/1535/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=input.nextInt();
            int q1W=Math.max(a,b);
            int q2W=Math.max(c,d);
            System.out.println((q1W>Math.min(c,d)  && q2W>Math.min(a,b))?"YES":"NO");
        }
    }
}
