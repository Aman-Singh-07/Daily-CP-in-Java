// https://codeforces.com/problemset/problem/1141/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        long m=input.nextLong();
        if(m%n!=0){
            System.out.println(-1);
            return;
        }
        if(n==m){
            System.out.println(0);
            return;
        }
        long r=m/n;
        int count=0;
        while(r%2==0){
            r/=2;
            count++;
        }
        while(r%3==0){
            r/=3;
            count++;
        }
        System.out.println(r==1?count:-1);
    }
}
