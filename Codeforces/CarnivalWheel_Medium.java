// https://codeforces.com/problemset/problem/2180/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            int a=input.nextInt();
            int b=input.nextInt();
            int g=gcd(n,b);
            int max=n-g+(a%g);
            System.out.println(max);
        }
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
