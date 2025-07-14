// https://www.codechef.com/problems/MARKALL

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
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		    }
		    int res=Math.min(a[0],a[n-1]);
		    int min=a[0];
		    for(int i=1;i<n;i++){
		        res=Math.min(res,min+a[i]);
		        min=Math.min(min,a[i]);
		    }
		    System.out.println(res);
		    
		}

	}
}
