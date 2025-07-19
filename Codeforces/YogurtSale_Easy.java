// https://codeforces.com/problemset/problem/1955/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int a=input.nextInt();
            int b=input.nextInt();
            System.out.println(Math.min(n*a,((n/2)*b+(n%2)*a)));
        }
    }
}
