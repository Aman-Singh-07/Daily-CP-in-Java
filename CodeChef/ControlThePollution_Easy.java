// https://www.codechef.com/problems/SMOKE

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
		    int n=input.nextInt();
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int x1=(n%100==0)?n/100:(n/100)+1;
		    int y1=(n%4==0)?n/4:(n/4)+1;
		    int z1=(n%100)%4==0?((n%100)/4)*y:(((n%100)/4)+1)*y;
		    int z=(n/100)*x+z1;
		    System.out.println(Math.min(x1*x,Math.min(y1*y,z)));
		    
		}

	}
}
