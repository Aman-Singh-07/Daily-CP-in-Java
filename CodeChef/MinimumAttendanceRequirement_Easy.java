// https://www.codechef.com/problems/ATTENDU

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
		    String s=input.next();
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1') count++;
		    }
		    System.out.println((((120-n)+count)/(1.20))>=75?"YES":"NO");
		}

	}
}
