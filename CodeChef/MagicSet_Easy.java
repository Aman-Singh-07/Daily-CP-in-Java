// https://www.codechef.com/problems/MGCSET?tab=statement

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
		    int m=input.nextInt();
		    int[] arr=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]%m==0) count++;
		    }
		    System.out.println((int)Math.pow(2,count)-1);
		}

	}
}
