// https://www.codechef.com/problems/CHDOGS?tab=statement
 
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
		    double s=input.nextDouble();
		    double v=input.nextDouble();
		    double time=((double)2/3)*(s/v);
		    System.out.printf("%.6f%n",time);
		    
		}

	}
}
