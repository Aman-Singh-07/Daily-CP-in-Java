// https://www.codechef.com/problems/BAKERY7

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
		int k=input.nextInt();
		System.out.println(Math.min(t*100,t*60+k));

	}
}
