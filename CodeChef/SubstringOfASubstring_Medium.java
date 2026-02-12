// https://www.codechef.com/problems/SUBSTRING?tab=statement

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
		    int count=0;
		    int res=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)==s.charAt(0) || s.charAt(i)==s.charAt(s.length()-1)){
		            res=Math.max(res,count);
		            count=0;
		        }else count++;
		    }
		    res=Math.max(res,count);
		    System.out.println(res==0?-1:res);
		}

	}
}
