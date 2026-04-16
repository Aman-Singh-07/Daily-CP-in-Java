// https://www.codechef.com/problems/BINCON

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
		    StringBuilder sb=new StringBuilder();
		    if(n==2) System.out.println("01");
		    else if(n==3) System.out.println("001");
		    else if(n==4) System.out.println("0110");
		    else if(n==5) System.out.println("01110");
		    else{
		        sb.append('0');
		        for(int i=0;i<n-2;i++) sb.append('1');
		        sb.append('0');
		        System.out.println(sb.toString());
		    }
		    
		}

	}
}
