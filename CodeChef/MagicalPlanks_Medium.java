// https://www.codechef.com/problems/MKGPLNKS

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
		    int countB=0;
		    int countW=0;
		    for(int i=0;i<n-1;i++){
		        if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)=='B') countB++;
		        else if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)=='W')
		        countW++;
		    }
		    System.out.println(Math.max(countW,countB));
		}

	}
}
