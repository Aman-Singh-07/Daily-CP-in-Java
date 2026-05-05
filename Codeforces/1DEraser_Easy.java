// https://codeforces.com/problemset/problem/1873/D

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int k=input.nextInt();
		    String s=input.next();
		    int i=0;
		    int count=0;
		    while(i<n){
		        if(s.charAt(i)=='B'){
		            count++;
		            i+=k;
		        }else i++;
		    }
		    System.out.println(count);
		}

	}
}
