// https://www.codechef.com/problems/NEWPIECE

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
		    int P=input.nextInt();
		    int Q=input.nextInt();
		    if(A==P && B==Q) System.out.println(0);
		    else if(((A+B)%2!=(P+Q)%2)) System.out.println(1);
		    else{
		        System.out.println(2);
		    }
		}

	}
}
