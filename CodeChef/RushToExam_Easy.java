// https://www.codechef.com/problems/RUSHTOEXAM

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
		int m=input.nextInt();
		int a=input.nextInt();
		int res=(m/a)+((m%a!=0)?1:0);
		System.out.println((n>=res)?"Yes":"No");

	}
}
