// https://www.codechef.com/problems/LEBOMBS

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
		    boolean[] ch=new boolean[n];
		    for(int i=1;i<n-1;i++){
		        if(s.charAt(i)=='1'){
		            ch[i-1]=true;
		            ch[i]=true;
		            ch[i+1]=true;
		        }
		    }
		    if(s.charAt(0)=='1'){
		        ch[0]=true;
		        if(n>1){
		            ch[1]=true;
		        }
		    }
		    if(s.charAt(n-1)=='1'){
		        ch[n-1]=true;
		        if(n>1){
		            ch[n-2]=true;
		        }
		    }
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(ch[i]!=true){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
