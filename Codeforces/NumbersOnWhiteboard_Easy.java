// https://codeforces.com/problemset/problem/1430/C

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
		    int max=n;
		    int min=n-1;
		    System.out.println(find(max,min,n));
		    for(int i=0;i<n-1;i++){
		        System.out.println(max+" "+min);
		        max=(max+min+1)/2;
		        min--;
		    }
		    
		}
		
		

	}
	public static int find(int max,int min,int n){
	    for(int i=0;i<n-2;i++){
		        max=(max+min+1)/2;
		        min--;
	    }
	    return (max+min+1)/2;
	    
	}
}
