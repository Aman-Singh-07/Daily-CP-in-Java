// https://www.codechef.com/problems/J7?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in); 
		int t = input.nextInt(); 
		while (t-- > 0) { 
		    double P = input.nextDouble(); 
		    double S = input.nextDouble();
		    double p = P / 4.0; 
		    double q = S / 2.0; 
		    double d = Math.sqrt(p * p - 3.0 * q);
		    double x = (p - d) / 3.0; 
		    double y = (p + 2.0 * d) / 3.0; 
		    double V = x * x * y; 
		    System.out.printf("%.2f%n", V + 1e-9); 
		}

	}
}
