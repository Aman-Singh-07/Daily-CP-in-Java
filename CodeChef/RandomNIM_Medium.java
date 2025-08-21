// https://www.codechef.com/problems/RNIM?tab=statement

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
		    int count=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x==1) count++;
		    }
		    if(count==n){
		        if(count%2==0) System.out.println(0);
		        else System.out.println(1);
		    }
		    else System.out.println(499122177);
		}

	}
}
