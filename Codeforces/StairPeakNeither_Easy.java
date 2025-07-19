// https://codeforces.com/problemset/problem/1950/A

import java.util.Scanner;
public class oddDivisor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            System.out.println((a<b && b<c)?"STAIR":(a<b && b>c)?"PEAK":"NONE");
        }
    }
}
