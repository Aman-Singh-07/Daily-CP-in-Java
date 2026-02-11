// https://codeforces.com/problemset/problem/2194/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long m=input.nextLong();
            System.out.println((n-(n/m)));
        }
    }
}
