// https://www.codechef.com/problems/XORRY1

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
		    String s=Long.toBinaryString(n);
		    StringBuilder sb1=new StringBuilder();
		    StringBuilder sb2=new StringBuilder();
		    int idx1=-1;
		    int idx2=-1;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='1' && idx1==-1){
		            idx1=i;
		        }
		        else if(s.charAt(i)=='1' && idx1!=-1){
		            idx2=i;
		            break;
		        }
		    }
		    int id=0;
		    if(idx2==-1){
		        id=-1;
		    }
		    for(int i=0;i<s.length();i++){
		        if(i==idx1) sb1.append('1');
		        else sb1.append('0');
		    }
		    for(int i=0;i<s.length();i++){
		        if(i<idx2) sb2.append('0');
		        else sb2.append(s.charAt(i));
		    }
		    
		    long num1=Long.parseLong(sb1.toString(),2);
		    long num2=Long.parseLong(sb2.toString(),2);
		    if(id==-1) num2=0;
		    System.out.println(num2+" "+num1);
		    
		}

	}
}
