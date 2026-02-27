// https://www.codechef.com/START227C/problems/DICEERMAX

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
		    long n=input.nextInt();
		    long s=input.nextInt();
		    long res1=n*6;
		    long res3=n*5;
		    if(res3>=s) System.out.println(res1);
		    else{
		        long rep=s-res3;
		        long rem=(n-rep)*6;
		        long res=rep*5+rem;
		        System.out.println(res);
		        
		    }
		}

	}
}
