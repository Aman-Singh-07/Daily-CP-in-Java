// https://codeforces.com/problemset/problem/1352/C

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long k=input.nextLong();
            System.out.println(k+(k-1)/(n-1));
        }
    }
}
