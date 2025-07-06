// https://www.codechef.com/problems/SUPINC?tab=statement

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
		    int k=input.nextInt();
		    int x=input.nextInt();
		    int pow=(int) Math.pow(2,k-1);
		    System.out.println((pow<=x)?"Yes":"No");
		}

	}
}
