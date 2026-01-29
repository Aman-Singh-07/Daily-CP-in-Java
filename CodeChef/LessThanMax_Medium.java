// https://www.codechef.com/START223C/problems/LEQMAX

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
		    int[] brr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        brr[i]=arr[i];
		    }
		    int res=0;
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(brr[i]==1){
		            count++;
		            res=Math.max(res,1);
		        }
		        else if(brr[i]==res+1){
		            count++;
		            res++;
		        }
		        else if(brr[i]<=res) count++;
		    }
		    System.out.println(count);
		}

	}
}
