// https://www.codechef.com/problems/FALSNUM

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
		    String res="";
		    if(s.charAt(0)!='1'){
		        res+="1"+s;
		    }
		    else{
		        res+=s.charAt(0)+"0"+s.substring(1,s.length());
		    }
		    System.out.println(res);
		}

	}
}
