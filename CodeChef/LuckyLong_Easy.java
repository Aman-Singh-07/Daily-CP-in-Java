// https://www.codechef.com/problems/LUCKY5?tab=statement

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
		    String n=input.next();
		    long count=0;
		    for(char ch:n.toCharArray()){
		        if(ch!='4' && ch!='7') count++;
		    }
		    System.out.println(count);
		}

	}
}
