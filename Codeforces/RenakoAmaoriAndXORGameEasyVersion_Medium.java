// https://codeforces.com/problemset/problem/2171/C1

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] a=new long[n];
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i]=input.nextLong();
            }
            long ca=0,cb=0;
            int last=-1;
            for(int i=0;i<n;i++){
                ca+=a[i];
                cb+=b[i];
                if(a[i]!=b[i]){
                    last=i;
                }
            }
            ca%=2;
            cb%=2;
            if(ca==cb){
                System.out.println("Tie");
            }else if(last%2==0){
                System.out.println("Ajisai");
            }else{
                System.out.println("Mai");
            }
        }
    }
}
