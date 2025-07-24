// https://www.codechef.com/problems/COVID19

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
		    int count=1;
		    int max=1;
		    int min=n;
		    for(int i=0;i<n-1;i++){
		        if(arr[i+1]-arr[i]<=2){
		            count++;
		        }
		        else{
		            min=Math.min(count,min);
		            max=Math.max(count,max);
		            count=1;
		        }
		    }
		    min=Math.min(min,count);
            max=Math.max(max,count);
		    System.out.println(min+" "+max);
		    
		}

	}
}
