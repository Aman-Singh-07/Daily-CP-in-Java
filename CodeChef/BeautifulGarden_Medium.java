// https://www.codechef.com/problems/DPF?tab=statement

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
		    int k=input.nextInt();
		    int d=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    long res=0;
		    int pluck=n-k;
		    for(int i=0;i<pluck;i++){
		        res+=((d-1)/arr[i])+1;
		        
		    }
		    System.out.println(res);
		}

	}
}
