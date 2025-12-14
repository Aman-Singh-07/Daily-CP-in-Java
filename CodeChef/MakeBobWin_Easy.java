// https://www.codechef.com/problems/DLSB?tab=statement

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
		    if(n==1){
		        if(s.equals("0")) System.out.println("1");
		        else System.out.println("0");
		    }
		    else{
		        int count=0;
		        if(s.charAt(0)=='0') count++;
		        if(s.charAt(n-1)=='0') count++;
		        System.out.println(count);
		    }
		}

	}
}
