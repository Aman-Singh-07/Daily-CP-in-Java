// https://codeforces.com/problemset/problem/1999/A

import java.util.Scanner;
public class oddDivisor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
