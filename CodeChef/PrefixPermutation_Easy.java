// https://www.codechef.com/problems/PREFPERM

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
		    int[] res=new int[n];
		    int[] arr=new int[k];
		    for(int i=0;i<k;i++) arr[i]=input.nextInt();
		    for(int i=1;i<=n;i++) res[i-1]=i;
		    int l=0;
		    for(int i=0;i<k;i++){
		        int temp=res[l];
		        res[l]=res[arr[i]-1];
		        res[arr[i]-1]=temp;
		        l=arr[i];
		    }
		    for(int num:res) System.out.print(num+" ");
		    System.out.println();
		    
		}

	}
}
