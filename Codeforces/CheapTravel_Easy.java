// https://codeforces.com/problemset/problem/466/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(Math.min((n/m)*b+Math.min((n%m)*a,b),n*a));
    }
}
