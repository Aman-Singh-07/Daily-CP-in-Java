// https://codeforces.com/problemset/problem/1391/B

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
		    int m=input.nextInt();
		    int count=0;
		    for(int i=0;i<n-1;i++){
		        String s=input.next();
		        if(s.charAt(m-1)=='R') count++;
		    }
		    String s=input.next();
		    for(int i=0;i<m-1;i++){
		        if(s.charAt(i)=='D') count++;
		    }
		    System.out.println(count);
		    
		}
		
	}
}
