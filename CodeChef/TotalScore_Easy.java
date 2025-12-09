// https://www.codechef.com/problems/TOTSCR?tab=statement

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
		    long[] arr=new long[k];
		    for(int i=0;i<k;i++){
		        arr[i]=input.nextLong();
		    }
		    for(int i=0;i<n;i++){
		        String s=input.next();
		        long res=0;
		        for(int j=0;j<k;j++){
		            if(s.charAt(j)=='1') res+=arr[j];
		        }
		        System.out.println(res);
		    }
		    
		}

	}
}
