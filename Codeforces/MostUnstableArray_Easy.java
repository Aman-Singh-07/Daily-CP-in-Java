// https://codeforces.com/contest/1353/problem/A

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
		    int m=input.nextInt();
		    if(n==1) System.out.println(0);
		    else if(n==2) System.out.println(m);
		    else System.out.println(2*m);
		}
	}
}
