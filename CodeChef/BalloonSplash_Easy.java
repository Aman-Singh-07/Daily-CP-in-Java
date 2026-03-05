// https://www.codechef.com/problems/BOP1

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		if(x>y) System.out.println("Alice");
		else if(y>x) System.out.println("Bob");
		else System.out.println("Draw");

	}
}
