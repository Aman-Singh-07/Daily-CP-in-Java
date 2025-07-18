// https://www.codechef.com/problems/RECNDSTR

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
		   String s=input.next();
		   char[] left=s.toCharArray();
		   char[] right=s.toCharArray();
		   char first = left[0];
		   for(int i=0;i<s.length()-1;i++){
		       left[i]=left[i+1];
		   }
		   left[s.length()-1]=first;
		   char last=right[s.length()-1];
		   for(int i=s.length()-1;i>0;i--){
		       right[i]=right[i-1];
		   }
		   right[0]=last;
		   
		   boolean isTrue=false;
		   if(new String(right).equals(new String(left))){
		       isTrue=true;
		   }
		   System.out.println(isTrue?"YES":"NO");
		}

	}
}
