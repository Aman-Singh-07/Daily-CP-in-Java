// https://www.codechef.com/problems/NICEARRAY

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
		    int count=0;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        
		    }
		    for(int i=0;i<n;i++){
		        if(arr[i]%k!=0) count++;
		        arr[i]=Math.floorDiv(arr[i],k);
		    }
		    int sum=0;
		    for(int i=0;i<n;i++){
		        sum+=arr[i];
		    }
		    if(0>=sum && 0<=(sum+count)) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
