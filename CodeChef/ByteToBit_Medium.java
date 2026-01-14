// https://www.codechef.com/problems/BITOBYT?tab=statement

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
		    long n=input.nextLong();
		    long count1=1;
		    long count2=0;
		    long count3=0;
		    while(n>0){
		        n-=2;
		        if(n>0){
		            count2=count1;
		            count1=0;
		            n-=8;
		            if(n>0){
		                count3=count2;
		                count2=0;
		                n-=16;
		                if(n>0){
		                    count1=count3*2;
		                    count3=0;
		                }
		            }
		        }
		    }
		    System.out.println(count1+" "+count2+" "+count3);
		}

	}
}
