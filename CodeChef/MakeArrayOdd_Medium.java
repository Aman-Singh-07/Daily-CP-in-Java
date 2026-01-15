// https://www.codechef.com/problems/MAKEARRAYODD?tab=statement

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
		    long x=input.nextLong();
		    long[] arr=new long[n];
		    long even=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		        if(arr[i]%2==0) even++;
		    }
		    if(x%2!=0){
		        if(even%2!=0){
		            System.out.println(even/2+1);
		        }else System.out.println(even/2);
		    }
		    else{
		        if(even!=n) System.out.println(even);
		        else System.out.println(-1);
		    }
		    
		}

	}
}
