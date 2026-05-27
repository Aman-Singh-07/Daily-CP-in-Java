// https://codeforces.com/contest/489/problem/B

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
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    int x=input.nextInt();
		    a[i]=x;
		}
		int m=input.nextInt();
		int[] b=new int[m];
		for(int i=0;i<m;i++){
		    int y=input.nextInt();
		    b[i]=y;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int count=0;
		int i=0;
		int j=0;
		while(i<n && j<m){
		    if(Math.abs(a[i]-b[j])<=1){
		        count++;
		        i++;
		        j++;
		    }else if(a[i]<b[j]) i++;
		    else j++;
		}
		System.out.println(count);

	}
}
