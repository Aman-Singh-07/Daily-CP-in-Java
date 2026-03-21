// https://www.codechef.com/problems/RESELL

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int count=0;
		    int i=n-1;
		    while(k>0 && i>=0){
		        if(arr[i]>=5){
		            count+=arr[i]-5;
		        }
		        k--;
		        i--;
		    }
		    while(i>=0){
		        if(arr[i]>=10) count+=arr[i]-10;
		        i--;
		    }
		    System.out.println(count);
		}

	}
}
