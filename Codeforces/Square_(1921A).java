// https://codeforces.com/problemset/problem/1921/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x1=input.nextInt();
            int y1=input.nextInt();
            int x2=input.nextInt();
            int y2=input.nextInt();
            int x3=input.nextInt();
            int y3=input.nextInt();
            int x4=input.nextInt();
            int y4=input.nextInt();
            if(Math.abs(x1-x2)==Math.abs(x3-x4) && Math.abs(x1-x2)!=0) System.out.println((x1-x2)*(x1-x2));
            else if(Math.abs(x1-x3)==Math.abs(x2-x4) && Math.abs(x1-x3)!=0) System.out.println((x1-x3)*(x1-x3));
            else if(Math.abs(x1-x4)==Math.abs(x2-x3) && Math.abs(x1-x4)!=0) System.out.println((x1-x4)*(x1-x4));
        }
    }
}
