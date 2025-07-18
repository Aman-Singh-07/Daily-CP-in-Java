// https://www.codechef.com/problems/ELECTIONS

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
		    int xa=input.nextInt();
		    int xb=input.nextInt();
		    int xc=input.nextInt();
		    if(xa>50){
		        System.out.println("A");
		    }
		    else if(xb>50){
		        System.out.println("B");
		    }
		    else if(xc>50){
		        System.out.println("C");
		    }
		    else System.out.println("NOTA");
		}

	}
}
