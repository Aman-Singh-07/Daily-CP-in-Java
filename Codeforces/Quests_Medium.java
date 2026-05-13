// https://codeforces.com/problemset/problem/1914/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int k=input.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		    }
		    long max=0;
            long curr=0;
            int best=0;
            int limit=Math.min(n,k);
            for(int i=0;i<limit;i++){
                curr+=a[i];
                best=Math.max(best,b[i]);
                int remain=k-(i+1);
                long total=curr+(long) remain*best;
                
                max=Math.max(max,total);
            }
            System.out.println(max);
		}

	}
}
