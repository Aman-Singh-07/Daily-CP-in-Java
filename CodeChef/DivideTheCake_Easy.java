// https://www.codechef.com/problems/ANUDTC?tab=statement

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
		    if((360%n==0)){
		        System.out.print("y ");
		    }
		    else System.out.print("n ");
		    if(n>360) System.out.print("n ");
		    else System.out.print("y ");
		    if(n>26) System.out.print("n ");
		    else System.out.print("y ");
		    System.out.println();
		}

	}
}
