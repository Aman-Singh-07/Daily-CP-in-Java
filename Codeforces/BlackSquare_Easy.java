// https://codeforces.com/problemset/problem/431/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
          int a=input.nextInt();
          int b=input.nextInt();
          int c=input.nextInt();
          int d=input.nextInt();
          String s=input.next();
          char[] chr=s.toCharArray();
          int res=0;
          for(char ch:chr){
              if(ch=='1') res+=a;
              else if(ch=='2') res+=b;
              else if(ch=='3') res+=c;
              else res+=d;
          }
          System.out.println(res);
    }
}
