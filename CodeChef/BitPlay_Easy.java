// https://www.codechef.com/problems/BITPLAY?tab=statement

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
		    long res=1;
		    int MOD=1000000007;
		    for(int i=0;i<s.length()-2;i+=2){
		        int a=s.charAt(i)-'0';
                int b=s.charAt(i+1)-'0';
                int c=s.charAt(i+2)-'0';
		        int curr=0;
		        if((a|b)==c) curr++;
		        if((a&b)==c) curr++;
		        if((a^b)==c) curr++;
		        res*=curr;
		        res%=MOD;
		        
		    }
		    System.out.println(res);
		}

	}
}
