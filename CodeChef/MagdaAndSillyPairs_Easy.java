// https://www.codechef.com/problems/SILLYPRS

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
		    Long[] a=new Long[n];
		    Long[] b=new Long[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextLong();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextLong();
		    }
		    Comparator<Long> evenFirst=(x,y)->{
                long modX=Math.abs(x%2);
                long modY=Math.abs(y%2);
                if(modX!=modY){
                    return Long.compare(modX,modY);
                }
                return Long.compare(x,y);
            };
            Arrays.sort(a,evenFirst);
            Arrays.sort(b,evenFirst);
		    long sum=0;
		    for(int i=0;i<n;i++){
		        sum+=(a[i]+b[i])/2;
		    }
		    System.out.println(sum);
		}

	}
}
