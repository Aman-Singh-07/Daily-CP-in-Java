// https://www.codechef.com/problems/ODDSEVENS
 
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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    System.out.println((a+b)%2==0?"Bob":"Alice");
		}
	}
}
