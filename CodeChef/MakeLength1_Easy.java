// https://www.codechef.com/problems/MAKELENGTH1

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
		    while(s.contains("11")){
		        s=s.replace("11","0");
		    }
		    System.out.println(s.contains("1") && s.length()>1?"NO":"YES");
		}

	}
}
