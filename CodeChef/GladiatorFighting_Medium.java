// https://www.codechef.com/problems/GLADFIGHT?tab=statement

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
		    if(n==2) System.out.println("0 0");
            else System.out.println((n-2)+" "+((n-1)*(n-2)/2));
		    
		}
	}
}
