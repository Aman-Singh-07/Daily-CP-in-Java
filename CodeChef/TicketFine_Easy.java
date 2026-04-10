// https://www.codechef.com/problems/TCKTFINE

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
		    int x=input.nextInt();
		    int p=input.nextInt();
		    int q=input.nextInt();
		    System.out.println(x*(p-q));
		}

	}
}
