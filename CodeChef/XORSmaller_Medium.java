// https://www.codechef.com/problems/XORSMALL

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
		    int bit=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(i==0) bit=arr[i];
		        else bit=bit&arr[i];
		    }
		    int count=0;
		    for(int i=0;i<=30;i++){
		        if(((bit>>i)&1)==1) count+=(1L<<i);
		    }
		    System.out.println(count);
		    
		}

	}
}
