// https://www.codechef.com/problems/PREDICT

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
		    double pA=input.nextDouble();
		    double pB=1.0-pA;
		    double p=Math.max(pA,pB);
		    double res=p*(10000+20000*(1-p));
		    System.out.println(res);
		}

	}
}
