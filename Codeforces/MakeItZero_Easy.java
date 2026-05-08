// https://codeforces.com/contest/1869/problem/A

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
		    if(n%2==0){
		        System.out.println("1");
		        System.out.println("1"+" "+(n));
		        System.out.println("1"+" "+(n));
		    }else{
		        System.out.println("4");
		        System.out.println("1"+" "+(n-1));
		        System.out.println("1"+" "+(n-1));
		        System.out.println((n-1)+" "+(n));
		        System.out.println((n-1)+" "+(n));
		    }
		}

	}
}
