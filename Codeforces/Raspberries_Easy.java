// https://codeforces.com/problemset/problem/1883/C

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
		    int k=input.nextInt();
		    int min=Integer.MAX_VALUE;
		    int count=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x%k==0){
		            min=0;
		        }else{
		            min=Math.min(min,k-x%k);
		        }
		        if(x%2==0) count++;
		    }
		    if(k==4){
		        int max=Math.max(0,2-count);
		        min=Math.min(min,max);
		    }
		    System.out.println(min);
		}

	}
}
