// https://www.codechef.com/problems/BOP3E?tab=statement

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
		    int count=0;
		    int[] temp=new int[n];
		    for(int i=0;i<n;i++){
		        temp[i]=Math.min(count,arr[i]);
		        if(count<arr[i]) count++;
		    }
		    print(temp,n);
		    System.out.println();
		    
		}

	}
	public static void print(int[] arr,int n){
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	    
	}
}
