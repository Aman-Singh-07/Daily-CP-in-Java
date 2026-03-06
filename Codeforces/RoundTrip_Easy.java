// https://codeforces.com/problemset/problem/2161/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long ro=input.nextLong();
            long x=input.nextLong();
            long d=input.nextLong();
            int n=input.nextInt();
            String s=input.next();
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='2'){
                    if(ro<x){
                        count++;
                        ro=Math.max(0,ro-d);
                    }
                }
                else{
                    count++;
                    ro=Math.max(0,ro-d);
                }
            }
            System.out.println(count);
            
        }
    }
}
