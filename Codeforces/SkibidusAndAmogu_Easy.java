// https://codeforces.com/problemset/problem/2065/A

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
		    String s=input.next();
		    System.out.println(s.substring(0,s.length()-2)+"i");
		}
	}
}
