// https://www.codechef.com/problems/MAX2?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s=input.next();
		int res=0;
		for(int i=n-1;i>=0 && s.charAt(i)=='0';i--){
		    res++;
		}
		System.out.println(res);
		

	}
}
