// https://codeforces.com/contest/2209/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0){
	        int n=input.nextInt();
	        long c=input.nextLong();
	        long k=input.nextLong();
	        long[] arr=new long[n];
	        for(int i=0;i<n;i++){
	            arr[i]=input.nextLong();
	        }
	        Arrays.sort(arr);
	        for(long x:arr){
	            if(x<=c){
	                long req=c-x;
	                if(k>=req){
	                    c+=req;
	                    k-=req;
	                }
	                else{
	                    c+=k;
	                    k=0;
	                }
	                c+=x;
	            }
	        }
	        System.out.println(c);
	    }

	}
}
