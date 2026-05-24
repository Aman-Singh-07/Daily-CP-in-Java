// https://codeforces.com/problemset/problem/520/B

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
		int m=input.nextInt();
		if(n==m) System.out.println(0);
		else if(n>m) System.out.println(n-m);
		else{
		    int count=0;
		    while(n<m){
		        if(m%2==0){
		            m/=2;
		        }else m++;
		        count++;
		    }
		    count+=n-m;
		    System.out.println(count);
		}

	}
}
