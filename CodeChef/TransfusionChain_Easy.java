// https://www.codechef.com/problems/TRANCHAIN?tab=statement

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
		    String[] s=new String[n];
		    int countA=0;
		    int countB=0;
		    int countAB=0;
		    int countO=0;
		    for(int i=0;i<n;i++){
		        s[i]=input.next();
		        if(s[i].equals("A")) countA++;
		        else if(s[i].equals("B")) countB++;
		        else if(s[i].equals("AB")) countAB++;
		        else countO++;
		    }
		    int mainChain=Math.max(countA+countAB,countB+countAB);
		    int maxChain=mainChain+countO;
		    if(countO==0 && countA==0 && countB==0) maxChain=countAB;
		    System.out.println(maxChain);
		}

	}
}
