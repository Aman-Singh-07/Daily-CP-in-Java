// https://www.codechef.com/problems/ARRSWAP

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
		    int[] arr=new int[2*n];
		    for(int i=0;i<2*n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int min=0;
		    int max=0;
		    int minDif=Integer.MAX_VALUE;
		    for(int i=n-1;i<2*n;i++){
		        min=arr[i-n+1];
		        max=arr[i];
		        minDif=Math.min(max-min,minDif);
		    }
		    System.out.println(minDif);
		}

	}
}
