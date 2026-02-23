// https://www.codechef.com/problems/ONEORTWO

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
		    long x=input.nextLong();
		    long y=input.nextLong();
		    long count=0;
		    if(x>=y+2) System.out.println("CHEF");
		    else if(y>=x+2) System.out.println("CHEFINA");
		    else{
		        count=Math.min(x,y);
		        if(count%2!=0) System.out.println("CHEF");
		        else System.out.println("CHEFINA");
		    }
		}

	}
}
