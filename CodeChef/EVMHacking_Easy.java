// https://www.codechef.com/problems/EVMHACK

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
		    int A=input.nextInt();
		    int B=input.nextInt();
		    int C=input.nextInt();
		    int P=input.nextInt();
		    int Q=input.nextInt();
		    int R=input.nextInt();
		    int a=P-A;
		    int b=Q-B;
		    int c=R-C;
		    int max=Math.max(a,Math.max(b,c));
		    int resSum=A+B+C+((max==a)?P-A:(max==b)?Q-B:R-C);
		    if(resSum>(P+Q+R)/2) System.out.println("YES");
		    else System.out.println("NO");
		    
		}

	}
}
