// https://www.codechef.com/problems/MAXTRI

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
		    int a=n;
		    int b=n-1;
		    int c=n-2;
		    while(2*Math.max(a,Math.max(b,c))>=a+b+c && (a!=0 && b!=0 && c!=0)){
		        if(c>0) c--;
		        else if(b>0) b--;
		        else a--;
		    }
		    System.out.println((2*Math.max(a,Math.max(b,c))<a+b+c)?a+b+c:-1);
		}

	}
}
