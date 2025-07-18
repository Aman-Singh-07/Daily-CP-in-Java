// https://www.codechef.com/problems/EASYPERM?tab=statement

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
		    for(int i=n;i>=1;i--){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}

	}
}
