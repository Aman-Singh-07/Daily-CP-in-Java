// https://www.codechef.com/problems/ALEXNUMB?tab=statement

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
		    long[] arr=new long[n];
		    long count=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		        count+=i;
		    }
		    System.out.println(count);
		}

	}
}
