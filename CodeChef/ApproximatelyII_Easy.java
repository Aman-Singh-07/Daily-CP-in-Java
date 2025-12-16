// https://www.codechef.com/problems/APPROX2

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
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            min=Math.min(min,Math.abs(arr[i]+arr[j]-k));
		        }
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(min==Math.abs(arr[i]+arr[j]-k)) count++;
		        }
		    }
		    System.out.println(min+" "+count);
		}

	}
}
