// https://www.codechef.com/problems/CHFM

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
		    long sum=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        sum+=arr[i];
		    }
		    double mean=(sum)/(n*1.0);
		    int res=-1;
		    for(int i=0;i<n;i++){
		        double temp=(sum-arr[i])/((n-1)*1.0);
		        if(mean==temp){
		            res=i+1;
		            break;
		        }
		    }
		    
		    System.out.println((res==-1)?"Impossible":res);
		    
		    
		}

	}
}
