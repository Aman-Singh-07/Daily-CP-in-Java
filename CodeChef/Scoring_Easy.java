// https://www.codechef.com/START216C/problems/SCORING

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
		    System.out.println((x+y)/2+" "+(((x+y)/2)-x));
		}

	}
}
