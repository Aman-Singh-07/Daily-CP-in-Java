// https://www.codechef.com/problems/ENCMSG

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
		    String st=input.next();
		    char[] ch=new char[n];
		    for(int i=0;i<n-1;i+=2){
		        ch[i]=st.charAt(i+1);
		        ch[i+1]=st.charAt(i);
		    }
		    if(n%2!=0){
		        ch[n-1]=st.charAt(n-1);
		    }
		    String alphFor="abcdefghijklmnopqrstuvwxyz";
		    String alphBack="zyxwvutsrqponmlkjihgfedcba";
		    for(int i=0;i<n;i++){
		        ch[i]=alphBack.charAt(alphFor.indexOf(ch[i]));
		    }
		    System.out.println(new String(ch));
		}

	}
}
