// https://www.codechef.com/problems/COLORB

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int b=input.nextInt();
		int sum=0;
		while(r>0 && b>0){
		    sum+=1;
		    r--;
		    b--;
		}
		System.out.println(sum*5+r+b*2);

	}
}
