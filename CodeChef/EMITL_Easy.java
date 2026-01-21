// https://www.codechef.com/problems/EMITL?tab=statement

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
		    int[] ch=new int[26];
		    for(char c:s.toCharArray()){
		        ch[c-'A']++;
		    }
		    if(s.length()==9 && ch[4]>=1 && ch[8]>=2 && ch[11]>=2 && ch[12]>=2 && ch[19]>=2) System.out.println("YES");
		    else if(ch[4]>=2 && ch[8]>=2 && ch[11]>=2 && ch[12]>=2 && ch[19]>=2) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
