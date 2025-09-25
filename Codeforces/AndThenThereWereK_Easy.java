// https://codeforces.com/problemset/problem/1527/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long res=Long.highestOneBit(n);
            System.out.println(res-1);
        }
    }
}
