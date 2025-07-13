// https://www.codechef.com/problems/BRACKETS

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
		    String s=input.next();
		    int balance=0;
		    int max_balance=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='(') balance++;
		        if(s.charAt(i)==')') balance--;
		        max_balance=Math.max(balance,max_balance);
		    }
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<max_balance;i++){
		        sb.append("(");
		    }
		    for(int i=0;i<max_balance;i++){
		        sb.append(")");
		    }
		    System.out.println(sb.toString());
		}

	}
}
