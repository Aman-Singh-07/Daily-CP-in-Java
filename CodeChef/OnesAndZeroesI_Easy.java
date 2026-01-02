// https://www.codechef.com/problems/OZ1?tab=statement

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
		    int count1=0;
		    int count0=0;
		    int res=0;
		    for(char ch:s.toCharArray()){
		        if(ch=='0') count0++;
		        else count1++;
		        if(find(count0,count1)) res++;
		    }
		    System.out.println(res);
		}

	}
	public static boolean find(int one, int two){
	    return one<=two;
	}
}
