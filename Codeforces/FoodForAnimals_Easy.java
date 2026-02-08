// https://codeforces.com/problemset/problem/1675/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            if(a>=x) x=0;
            else x-=a;
            if(b>=y) y=0;
            else y-=b;
            if((x+y)<=c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
