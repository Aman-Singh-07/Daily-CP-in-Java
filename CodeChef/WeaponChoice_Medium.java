// https://www.codechef.com/problems/WEPCH

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
		    long H=input.nextInt();
		    long X=input.nextInt();
		    long Y1=input.nextInt();
		    long Y2=input.nextInt();
		    long K=input.nextInt();
		    long gun=(H+X-1)/X;
		    long laser;
		    if(Y1*K>=H){
                laser=(H+Y1-1)/Y1;
            }else{
                long remain=H-Y1*K;
                long extra=(remain+Y2-1)/Y2;
                laser=K+extra;
            }
		    System.out.println(Math.min(laser,gun));
		  
		}

	}
}
