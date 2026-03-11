// https://codeforces.com/problemset/problem/2170/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            if(n==1) System.out.println(1);
            else if(n==2) System.out.println(9);
            else{
                int res=n*n;
                int num1=((4*res-4-n));
                int num2=((5*res-5-5*n));
                System.out.println(Math.max(num1,num2));
            }
            
        }
    }
}
