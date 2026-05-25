// https://codeforces.com/problemset/problem/702/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=input.nextInt();
		int count=1;
		int max=1;
		for(int i=0;i<n-1;i++){
		    if(arr[i]>=arr[i+1]){
		        max=Math.max(max,count);
		        count=1;
		    }
		    else count++;
		}
    max=Math.max(max,count);
		System.out.println(max);

	}
}
