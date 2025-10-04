// https://www.codechef.com/problems/PLAYFIT

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            long min=arr[0];
            long max=Long.MIN_VALUE;
            for(int i=1;i<n;i++){
                max=Math.max(max,arr[i]-min);
                min=Math.min(min,arr[i]);
            }

            if(max>0){
                System.out.println(max);
            }else{
                System.out.println("UNFIT");
            }
        }
    }
}
