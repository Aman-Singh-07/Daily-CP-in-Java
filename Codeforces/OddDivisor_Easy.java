// https://codeforces.com/problemset/problem/1475/A

import java.util.Scanner;
public class oddDivisor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        long t=input.nextLong();
        while(t-->0){
            long n=input.nextLong();
            System.out.println((n&(n-1))==0?"NO":"YES");
        }
    }
}
