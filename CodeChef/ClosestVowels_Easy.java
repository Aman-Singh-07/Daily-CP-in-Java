// https://www.codechef.com/problems/CLOSEVOWEL?tab=statement

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
		    long res=1L;
		    char ch[]=s.toCharArray();
		    for(int i=0;i<n;i++){
		        if(ch[i]=='c' || ch[i]=='g' || ch[i]=='l' || ch[i]=='r'){
		            res=(res*2)%1000000007;
		        }
		    }
		    System.out.println(res);
		}

	}
}
