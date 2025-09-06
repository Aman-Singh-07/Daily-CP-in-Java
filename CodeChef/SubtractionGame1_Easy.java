// https://www.codechef.com/problems/AMSGAME1?tab=ide

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int res=arr[0];
		    for(int i=0;i<n;i++){
		        res=gcd(res,arr[i]);
		    }
		    System.out.println(res);
		}

	}
	
	public static int gcd(int a,int b){
	    if(b==0){
	        return a;
	    }
	    return gcd(b,a%b);
	}
}
