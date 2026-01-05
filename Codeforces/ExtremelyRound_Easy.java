// https://codeforces.com/problemset/problem/1766/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-- >0){
            int n=input.nextInt();
            String s=String.valueOf(n);
            int digits=s.length();
            int firstDigit=s.charAt(0)-'0';
            int res=9*(digits-1)+firstDigit;
            System.out.println(res);
        }
    }
}
