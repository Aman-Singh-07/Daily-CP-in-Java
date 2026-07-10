// https://codeforces.com/contest/2233/problem/A

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int val=findanswer(n,x,y,z);
            System.out.println(val);
        }
    }
    public static int findanswer(int n,int x,int y,int z){
        int m1=(int)Math.ceil((double)n/(double)(x+y));
        int m2=z+(int)Math.ceil((double)(n-x*z)/(double)(10*y + x));
        return Math.min(m1,m2);
    }
}
