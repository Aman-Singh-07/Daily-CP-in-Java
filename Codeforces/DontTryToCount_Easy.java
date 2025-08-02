// https://codeforces.com/problemset/problem/1881/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
           int n=input.nextInt();
           int m=input.nextInt();
           String a=input.next();
           String b=input.next();
           int count=0;
           while(!a.contains(b)){
               a=a+a;
               count++;
               if(a.length()>1000) break;
           }
           System.out.println((a.contains(b))?count:-1);
        }
    }
}
