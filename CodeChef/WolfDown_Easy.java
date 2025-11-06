// https://www.codechef.com/problems/WOLFDOWN?tab=statement

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
		    while(s.contains("10")){
		        s=s.replace("10","1");
		    }
		    int count=0;
		    for(char c:s.toCharArray()){
		        if(c=='0') count++;
		    }
		    System.out.println(count);
		}

	}
}
