// https://www.codechef.com/problems/PASCRO

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
		    String s1=input.next();
		    String s2=input.next();
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<n;i++){
		        if(s1.charAt(i)=='R' && s2.charAt(i)=='P') count2++;
		        else if(s1.charAt(i)=='R' && s2.charAt(i)=='S') count1++;
		        else if(s1.charAt(i)=='S' && s2.charAt(i)=='P') count1++;
		        else if(s1.charAt(i)=='S' && s2.charAt(i)=='R') count2++;
		        else if(s1.charAt(i)=='P' && s2.charAt(i)=='R') count1++;
		        else if(s1.charAt(i)=='P' && s2.charAt(i)=='S') count2++;
		    }
		    System.out.println((count1>count2)?0:((count2-count1)/2)+1);
		}

	}
}
