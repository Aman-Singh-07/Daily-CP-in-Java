// https://codeforces.com/problemset/problem/451/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        System.out.println(Math.min(m,n)%2==0?"Malvika":"Akshat");
    }
}
