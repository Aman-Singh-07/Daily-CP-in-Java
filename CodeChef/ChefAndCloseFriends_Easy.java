// https://www.codechef.com/problems/P4HOME?tab=statement

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
		    int y=input.nextInt();
		    int z=input.nextInt();
		    System.out.println((Math.min(y,z))*2);
		}

	}
}
