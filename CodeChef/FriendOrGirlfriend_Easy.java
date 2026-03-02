// https://www.codechef.com/problems/STRCH?tab=statement

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
		    char ch=input.next().charAt(0);
		    long res=0;
		    int idx=-1;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)==ch) idx=i;
		        if(idx!=-1) res+=idx+1;
		    }
		    System.out.println(res);
		}

	}
}
