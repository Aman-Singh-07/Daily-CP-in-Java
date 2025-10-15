// https://codeforces.com/problemset/problem/2051/B

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            long cycle=a+b+c;
            long fullCycles=n/cycle;
            long covered=fullCycles*cycle;
            long day=fullCycles*3;
            if(covered>=n){
                System.out.println(day);
                continue;
            }
            if(covered+a>=n){
                System.out.println(day+1);
            }else if(covered+a+b>=n){
                System.out.println(day+2);
            }else{
                System.out.println(day+3);
            }
        }
    }
}
