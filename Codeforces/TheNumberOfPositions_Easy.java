// https://codeforces.com/problemset/problem/124/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(n-Math.max(a+1,n-b)+1);
    }
}
