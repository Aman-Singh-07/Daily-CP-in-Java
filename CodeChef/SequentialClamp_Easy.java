// https://www.codechef.com/problems/SEQCLAMP

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
		    int x=Integer.MAX_VALUE;
		    for(int i=0;i<n;i++){
		        int a=input.nextInt();
		        int b=input.nextInt();
		        if(x<a) x=a;
		        if(x>b) x=b;
		    }
		    System.out.println(x);
		}

	}
}
