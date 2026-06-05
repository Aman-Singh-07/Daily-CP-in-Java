// https://www.codechef.com/problems/INTINT

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    long[] a=new long[n];
		    long[] b=new long[n];
		    long sum=0;
		    for(int i=0;i<n;i++) a[i]=input.nextLong();
		    for(int i=0;i<n;i++) b[i]=input.nextLong();
		    long[] prefA=new long[n];
            long[] prefB=new long[n];
            prefA[0]=a[0];
            prefB[0]=b[0];
            for(int i=1;i<n;i++){
                prefA[i]=Math.max(a[i],prefA[i-1]+a[i]);
                prefB[i]=Math.max(b[i],prefB[i-1]+b[i]);
            }
            long[] suffA=new long[n];
            long[] suffB=new long[n];
            suffA[n-1]=a[n-1];
            suffB[n-1]=b[n-1];
            for(int i=n-2;i>=0;i--){
                suffA[i]=Math.max(a[i],suffA[i+1]+a[i]);
                suffB[i]=Math.max(b[i],suffB[i+1]+b[i]);
            }
            long maxScore=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long maxValA=prefA[i]+suffA[i]-a[i];
                long maxValB=prefB[i]+suffB[i]-b[i];
                maxScore=Math.max(maxScore,maxValA+maxValB);
            }
            System.out.println(maxScore);
        }

	}
}
