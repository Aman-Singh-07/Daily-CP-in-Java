// https://codeforces.com/problemset/problem/1342/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long x=input.nextLong();
            long y=input.nextLong();
            long a=input.nextLong();
            long b=input.nextLong();
            long z=x*a+y*a;
            long min=Math.min(x,y);
            long res=min*b;
            x-=min;
            y-=min;
            res+=a*x+y*a;
            System.out.println(Math.min(res,z));
        }

    }
}
