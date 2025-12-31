// https://www.codechef.com/problems/CHFMOT18?tab=statement

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
		    if(n%2!=0){
		        res++;
		        n--;
		    }
		    res+=(n%k==0)?n/k:(n/k)+1;
		    System.out.println(res);
		}

	}
}
