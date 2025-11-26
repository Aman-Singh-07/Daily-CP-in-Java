// https://www.codechef.com/problems/CUTPIZ?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int gcd=360;
            for(int i=0;i<n-1;i++){
                gcd=gcd(gcd,arr[i+1]-arr[i]);
            }
            gcd=gcd(gcd,360-arr[n-1]+arr[0]);
            int slices=360/gcd;
            int extraCuts=slices-n;
            System.out.println(extraCuts);
        }
    }

    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
