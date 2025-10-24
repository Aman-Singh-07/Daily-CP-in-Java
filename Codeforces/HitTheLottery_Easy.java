// https://codeforces.com/problemset/problem/996/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        int count=0;
        count+=n/100;
        n%=100;
        count+=n/20;
        n%=20;
        count+=n/10;
        n%=10;
        count+=n/5;
        n%=5;
        count+=n;
        System.out.println(count);
    }
}
