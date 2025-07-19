// https://codeforces.com/problemset/problem/1409/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            System.out.println((int)Math.ceil(Math.abs(a-b)/10.0));
        }
    }
}
