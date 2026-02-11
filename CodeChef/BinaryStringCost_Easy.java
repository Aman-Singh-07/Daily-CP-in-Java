// https://www.codechef.com/problems/BSCOST?tab=statement

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
		    int x=input.nextInt();
		    int y=input.nextInt();
		    String s=input.next();
		    if(s.contains("0") && s.contains("1")) System.out.println(Math.min(x,y));
		    else System.out.println(0);
		}
	}
}
