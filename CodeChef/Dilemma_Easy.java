// https://www.codechef.com/problems/CHEFDIL?tab=statement

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
		    int count=0;
		    for(char ch:s.toCharArray()){
		        if(ch=='1') count++;
		    }
		    if(count%2!=0) System.out.println("WIN");
		    else System.out.println("LOSE");
		    
		}

	}
}
