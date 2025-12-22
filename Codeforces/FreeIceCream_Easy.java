// https://codeforces.com/problemset/problem/686/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n=input.nextLong();
        long m=input.nextLong();
        long count=0;
        while (n-- > 0) {
            char ch=input.next().charAt(0);
            long x=input.nextLong();
            if(ch=='+') m+=x;
            else{
                if(m>=x) m-=x;
                else count++;
            }
        }
        System.out.println(m+" "+count);
    }
}
