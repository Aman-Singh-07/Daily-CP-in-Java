// https://www.codechef.com/problems/TWODIFFPALIN?tab=statement

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
		    int A=input.nextInt();
		    int B=input.nextInt();
		    if(A%2==0 && B%2==0) System.out.println("Yes");
		    else if(A==1 || B==1 || (A%2!=0 && B%2!=0)) System.out.println("No");
		    else System.out.println("Yes");
		}

	}
}
