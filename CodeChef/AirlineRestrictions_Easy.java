// https://www.codechef.com/problems/AIRLINE

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    int d=input.nextInt();
		    int e=input.nextInt();
		    if((a+b)<=d && c<=e || (a+c)<=d && b<=e || (b+c)<=d && a<=e){
		        System.out.println("YES");
		    }
		    else System.out.println("NO");
		}

	}
}
