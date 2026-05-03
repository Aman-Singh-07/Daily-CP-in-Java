// https://codeforces.com/contest/2033/problem/A

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
		    System.out.println(n%2!=0?"Kosuke":"Sakurako");
		}

	}
}
