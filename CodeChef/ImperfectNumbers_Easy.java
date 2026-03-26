// https://www.codechef.com/START231C/problems/NO25PLS

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
		    int num=input.nextInt();
		    if(num%10==0) System.out.println("2");
		    else if(num%10==1 || num%10==3 || num%10==7 || num%10==9) System.out.println("1");
		    else System.out.println("0");
		}

	}
}
