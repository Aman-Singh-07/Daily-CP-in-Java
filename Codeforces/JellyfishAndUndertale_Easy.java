// https://codeforces.com/contest/1875/problem/A

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int n=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    long sum=b;
		    for(int i=0;i<n;i++){
		        sum+=Math.min(arr[i],a-1);
		    }
		    System.out.println(sum);
		}

	}
}
