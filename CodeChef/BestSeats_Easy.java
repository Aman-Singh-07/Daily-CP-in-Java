// https://www.codechef.com/START216C/problems/BESTSEATS

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
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<n-1;i++){
		        min=Math.min(min,arr[i]+arr[i+1]);
		    }
		    System.out.println(min);
		}

	}
}
