// https://www.codechef.com/problems/HP18

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int countA=0;
		    int countB=0;
		    int count=0;
		    for(int i=0;i<n;i++){
		        long x=input.nextLong();
		        if(x%a==0 && x%b==0) count++;
		        else if(x%a==0) countA++;
		        else if(x%b==0) countB++;
		    }
		    if(countA>countB) System.out.println("BOB");
		    else if(countA==countB && count>0) System.out.println("BOB");
		    else System.out.println("ALICE");
		    
		}

	}
}
