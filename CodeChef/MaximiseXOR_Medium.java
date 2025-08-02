// https://www.codechef.com/problems/XORMAX 

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
		    String s1=input.next();
		    String s2=input.next();
		    int count1In1=0;
		    int count0In1=0;
		    int count1In2=0;
		    int count0In2=0;
		    for(int i=0;i<s1.length();i++){
		        if(s1.charAt(i)=='1') count1In1++;
		        if(s2.charAt(i)=='1') count1In2++;
		        if(s1.charAt(i)=='0') count0In1++;
		        if(s2.charAt(i)=='0') count0In2++;
		    }
		    char[] ch1=s1.toCharArray();
		    char[] ch2=s2.toCharArray();
		    for(int i=0;i<s1.length();i+=2){
		        if(count1In1-->0){
		            ch1[i]='1';
		        }
		        else if(count0In1-->0) ch1[i]='0';
		        if(count0In2-->0){
		            ch2[i]='0';
		        }
		        else if(count1In2-->0) ch2[i]='1';
		    }
		    for(int i=1;i<s1.length();i+=2){
		        if(count0In1-->0) ch1[i]='0';
		        else if(count1In1-->0){
		            ch1[i]='1';
		        }
		        if(count1In2-->0) ch2[i]='1';
		        else if(count0In2-->0){
		            ch2[i]='0';
		        }
		    }
		    
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<s1.length();i++){
		        if((ch1[i]=='1' && ch2[i]=='0') || (ch1[i]=='0' && ch2[i]=='1')){
		            sb.append('1');
		        }
		        else sb.append('0');
		    }
		    String s3=sb.toString();
		    int count=0;
		    for(int i=0;i<s3.length();i++){
		        if(s3.charAt(i)=='1') count++;
		    }
		    StringBuilder res=new StringBuilder();
		    while(count-->0) res.append('1');
		    while(res.length()<s3.length()) res.append('0');
		    System.out.println(res.toString());
		   
		}

	}
}
