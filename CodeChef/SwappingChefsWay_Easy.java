// https://www.codechef.com/problems/SWAPCW

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
		    String s=input.next();
		    char[] ch=s.toCharArray();
		    char[] chr=s.toCharArray();
		    Arrays.sort(ch);
		    StringBuilder sb1=new StringBuilder();
		    for(char c:ch){
		        sb1.append(c);
		    }
		    for(int i=0;i<n/2;i++){
		        if(chr[i]>chr[(n-i-1)]){
		            char temp=chr[(i)];
		            chr[i]=chr[n-i-1];
		            chr[n-i-1]=temp;
		        }
		    }
		    StringBuilder sb2=new StringBuilder();
		    for(char c:chr){
		        sb2.append(c);
		    }
		    
		    System.out.println(sb1.toString().equals(sb2.toString())?"YES":"NO");
		}

	}
}
