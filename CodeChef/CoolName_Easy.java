// https://www.codechef.com/problems/CALPOWER

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
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            long res=0;
            for(int i=0;i<ch.length;i++){
                res+=(ch[i]-'a'+1)*(i+1);
            }
            System.out.println(res);
		}

	}
}
