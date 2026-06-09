// https://codeforces.com/problemset/problem/1300/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int[] arr=new int[n*2];
		    for(int i=0;i<2*n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    
		    System.out.println(arr[n]-arr[n-1]);
		}
		
		

	}
}
