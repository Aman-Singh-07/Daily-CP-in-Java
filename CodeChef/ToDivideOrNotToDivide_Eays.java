// https://www.codechef.com/problems/DIVAB?tab=ide

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
		    long A=input.nextLong();
		    long B=input.nextLong();
		    long N=input.nextLong();
		    if(A%B==0){
                System.out.println(-1);
                continue;
            }
		    long num=(N%A==0 && N%B!=0)?N:((N/A)+1)*A;
		    if(num%B==0){
                num+=A;
            }
		    System.out.println(num);
		}

	}
}
