// https://codeforces.com/problemset/problem/2209/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0){
	        int n=input.nextInt();
	        long[] arr=new long[n];
	        for(int i=0;i<n;i++){
	            arr[i]=input.nextLong();
	        }
	        for(int i=0;i<n;i++){
	            int count1=0;
	            int count2=0;
	            for(int j=i+1;j<n;j++){
	                if((arr[i])>(arr[j])) count1++;
	                if((arr[i])<(arr[j])) count2++;
	            }
	            System.out.print(Math.max(count1,count2)+" ");
	        }
	        System.out.println();
	    }

	}
}
