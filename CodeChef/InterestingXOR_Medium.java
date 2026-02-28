// https://www.codechef.com/problems/IRSTXOR?tab=ide

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
		    String sn=Long.toBinaryString(n);
		    StringBuilder a=new StringBuilder();
		    StringBuilder b=new StringBuilder();
		    int c=0;
		    for(char ch:sn.toCharArray()){
		        if(ch=='1'){
		            if(c==0){
		                a.append('1');
		                b.append('0');
		            }else{
		                a.append('0');
		                b.append('1');
		            }
		        }else if(ch=='0'){
		            a.append('1');
		            b.append('1');
		        }
		        c++;
		    }
		    long finalA=Long.parseLong(a.toString(),2);
            long finalB=Long.parseLong(b.toString(),2);
            System.out.println(finalA*finalB);
		}

	}
}
