// https://www.codechef.com/problems/LONGSEQ?tab=statement

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
		    String d=input.next();
		    int count1=0;
		    int count0=0;
		    for(char ch:d.toCharArray()){
		        if(ch=='1') count1++;
		        else if(ch=='0') count0++;
		    }
		    System.out.println((count0==1 || count1==1)?"Yes":"No");
		}

	}
}
