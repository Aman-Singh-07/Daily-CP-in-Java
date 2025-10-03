// https://www.codechef.com/problems/VCOUPLE

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
		    long[] boy=new long[n];
		    long[] girl=new long[n];
		    for(int i=0;i<n;i++){
		        boy[i]=input.nextLong();
		    }
		    for(int i=0;i<n;i++){
		        girl[i]=input.nextLong();
		    }
		    Arrays.sort(boy);
		    Arrays.sort(girl);
		    long max=0;
		    for(int i=0;i<n;i++){
		        if(boy[i]+girl[n-i-1]>max){
		            max=boy[i]+girl[n-i-1];
		        }
		    }
		    System.out.println(max);
		}

	}
}
