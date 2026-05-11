// https://www.codechef.com/problems/DIVKIDS

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
		    int x=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int res=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]%x==0){
		            res=Math.max(arr[i],res);
		        }
		    }
		    System.out.println(res);
		}

	}
}
