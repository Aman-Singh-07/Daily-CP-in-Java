// https://codeforces.com/problemset/problem/1742/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            System.out.println(2*Math.max(a,Math.max(b,c))==a+b+c?"YES":"NO");
        }
    }
}
