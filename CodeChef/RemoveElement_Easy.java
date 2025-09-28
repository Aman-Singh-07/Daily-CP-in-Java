// https://www.codechef.com/problems/REMELEM?tab=statement

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
		    long k=input.nextLong();
		    long[] arr=new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		    }
		    Arrays.sort(arr);
		    if(n==1) System.out.println("YES");
		    else if(arr[n-1]>k) System.out.println("NO");
		    else if(arr[n-1]+arr[0]>k) System.out.println("NO");
		    else System.out.println("YES");
		}

	}
}
