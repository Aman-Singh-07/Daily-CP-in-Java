// https://www.codechef.com/problems/POPGATES

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
		        char ch=input.next().charAt(0);
		        if(ch=='H') arr[i]=0;
		        else arr[i]=1;
		    }
		    int count=0;
		    int i=n-1;
		    int temp=k;
		    while(temp-->0){
		        if((arr[i--]+count)%2==0) count++;
		    }
		    int res=0;
		    for(int j=0;j<n-k;j++){
		        if((arr[j]+count)%2==0) res++;
		    }
		    System.out.println(res);
		}

	}
}
