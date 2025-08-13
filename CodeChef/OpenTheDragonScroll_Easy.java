// https://www.codechef.com/problems/DRAGNXOR

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
		    int count11=Integer.bitCount(a);
		    int count21=Integer.bitCount(b);
		    int count10=n-count11;
		    int count20=n-count21;
		    StringBuilder sb=new StringBuilder();
		    while((count11>0 && count20>0)){
		        count11--;
		        count20--;
		        sb.append('1');
		    }
		    while(count10>0 && count21>0){
		        count10--;
		        count21--;
		        sb.append('1');
		    }
		    
		    while(sb.length()<n){
		        sb.append('0');
		    }
		    System.out.println(Integer.parseInt(sb.toString(),2));
		    
		}

	}
}
