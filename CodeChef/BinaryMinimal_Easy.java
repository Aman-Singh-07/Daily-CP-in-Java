// https://www.codechef.com/problems/BILM

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
		    String s=input.next();
		    int count=0;
		    char[] ch=s.toCharArray();
		    for(char c:ch){
		        if(c=='1') count++;
		    }
		    if(count<=k){
		        for(int i=0;i<ch.length;i++){
		            if(k>0){
		                if(ch[i]=='1'){
		                    ch[i]='7';
		                    k--;
		                }
		            }
		        }
		    }
		    else{
		        for(int i=0;i<ch.length;i++){
		            if(k>0){
		                if(ch[i]=='1'){
		                    ch[i]='0';
		                    k--;
		                }
		            }
		        }
		    }
		    
		    for(int i=0;i<ch.length;i++){
		        if(k>0){
		            if(ch[i]=='0'){
		                ch[i]='7';
		                k--;
		            }
		        }
		    }
		    StringBuilder sb=new StringBuilder();
		    for(char c:ch){
		        if(c!='7') sb.append(c);
		    }
		    System.out.println(sb.toString());
		    
		}

	}
}
