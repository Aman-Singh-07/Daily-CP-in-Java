// https://codeforces.com/problemset/problem/1472/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long w=input.nextLong();
            long h=input.nextLong();
            long res=w*h;
            long n=input.nextLong();
            while(w%2==0 || h%2==0){
                if(w%2==0) w/=2;
                else if(h%2==0) h/=2;
            }
            if(res/(w*h)>=n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
