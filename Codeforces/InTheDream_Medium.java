// https://codeforces.com/contest/2136/problem/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=input.nextInt();
            c-=a;
            d-=b;
            if(a>b){
                int tmp=a;
                a=b;
                b=tmp;
            }
            if(c>d){
                int tmp=c;
                c=d;
                d=tmp;
            }
            if(2*(a+1)>=b && 2*(c+1)>=d){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
