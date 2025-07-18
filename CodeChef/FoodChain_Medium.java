// https://www.codechef.com/problems/FODCHAIN

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
		    int e=input.nextInt();
		    int k=input.nextInt();
		    int count=0;
		    while(e!=0){
		        e=e/k;
		        count++;
		    }
		    System.out.println(count);
		}

	}
}
