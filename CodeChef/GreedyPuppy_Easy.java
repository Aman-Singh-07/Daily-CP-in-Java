// https://www.codechef.com/problems/GDOG?tab=statement

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
		    int k=input.nextInt();
		    int res=0;
		    for(int i=1;i<=k;i++){
		        res=Math.max(res,n%i);
		    }
		    System.out.println(res);
		}
		


	}
}
