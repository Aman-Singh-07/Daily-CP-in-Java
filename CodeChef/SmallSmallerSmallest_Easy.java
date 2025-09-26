// https://www.codechef.com/problems/BSHORT?tab=statement

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
		    int count0=0;
		    int count1=0;
		    String s=input.next();
		    for(char ch:s.toCharArray()){
		        if(ch=='0') count0++;
		        else count1++;
		    }
		    if(count1>0){
		        if(count1%2==0) System.out.println(0);
		        else System.out.println(1);
		    }
		    else System.out.println(n);
		}

	}
}
