// https://www.codechef.com/problems/PASSEXAMS

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
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int z=input.nextInt();
		    int count=0;
		    if(x>=50) count++;
		    if(y>=50) count++;
		    if(z>=50) count++;
		    System.out.println(count>=2?"Yes":"No");
		    
		}

	}
}
