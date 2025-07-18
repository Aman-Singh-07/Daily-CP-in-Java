// https://www.codechef.com/problems/LOSTWKND

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
		    int a1=input.nextInt();
		    int a2=input.nextInt();
		    int a3=input.nextInt();
		    int a4=input.nextInt();
		    int a5=input.nextInt();
		    int p=input.nextInt();
		    int sum=p*(a1+a2+a3+a4+a5);
		    System.out.println((sum>120)?"Yes":"No");
		}

	}
}
