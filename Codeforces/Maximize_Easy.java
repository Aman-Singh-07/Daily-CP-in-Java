// https://codeforces.com/problemset/problem/1968/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
        int x=input.nextInt();
        int max=0;
        int y=1;
        int res=1;
        while(y<x){
            int g=gcd(x,y)+y;
            if(g>max){
                max=g;
                res=y;
            }
            y++;
        }
        System.out.println(res);
        }
       
        
    }
    
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
