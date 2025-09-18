// https://www.codechef.com/problems/MOBKUN

import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            int k=input.nextInt();
            int x=input.nextInt();
            int block=k*n+m;   
            int pos=x%block;
            if(pos==0) pos=block;
            if(pos>(k-1)*n){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
