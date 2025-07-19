// https://codeforces.com/problemset/problem/1772/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int a=Integer.valueOf(String.valueOf(s.charAt(0)));
            int b=Integer.valueOf(String.valueOf(s.charAt(2)));
            System.out.println(a+b);
        }
    }
}
