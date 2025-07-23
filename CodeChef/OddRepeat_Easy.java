// https://www.codechef.com/problems/REPEAT

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
		    int s=input.nextInt();
		    int num=1;
		    int sum=0;
		    for(int i=0;i<n;i++){
		        sum+=num;
		        num+=2;
		    }
		    System.out.println((s-(sum))/(k-1));
		}

	}
}
