// https://codeforces.com/problemset/problem/1986/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x1=input.nextInt();
            int x2=input.nextInt();
            int x3=input.nextInt();
            int first=Math.min(x1,Math.min(x2,x3));
            int last=Math.max(x1,Math.max(x2,x3));
            int mid=x2;
            if(x1!=first && x1!=last) mid=x1;
            else if(x3!=first && x3!=last) mid=x3;
            int res=(mid-first)+(last-mid);
            System.out.println(res);
        }
    }
}
