// https://www.codechef.com/problems/MAKETRIANGLE

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
		    int req=0;
		    if(x+y<=z){
		        req=Math.max(req,z+1-x-y);
		    }
		    if(y+z<=x){
		        req=Math.max(req,x+1-z-y);
		    }
		    if(x+z<=y){
		        req=Math.max(req,y+1-z-x);
		    }
		    System.out.println(req);
		}

	}
}
