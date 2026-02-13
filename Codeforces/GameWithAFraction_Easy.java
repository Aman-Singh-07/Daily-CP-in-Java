// https://codeforces.com/problemset/problem/2196/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long m=input.nextLong();
            if(n<m && 2*m<=3*n) System.out.println("Bob");
            else System.out.println("Alice");
        }
    }
}
