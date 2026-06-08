// https://codeforces.com/problemset/problem/1791/E

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
		    int count=0;
		    long sum=0;
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        int x=(input.nextInt());
		        sum+=Math.abs(x);
		        if(x<=0) count++;
		        min=Math.min(min,Math.abs(x));
		    }
		    if(count%2==0) System.out.println(sum);
		    else System.out.println(sum-2*min);
		}

	}
}
