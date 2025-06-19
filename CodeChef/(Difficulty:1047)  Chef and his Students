// https://www.codechef.com/problems/CHEFSTUD?tab=statement

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
		    for(int i=0;i<ch.length;i++){
		        if(ch[i]=='>') ch[i]='<';
		        else if(ch[i]=='<') ch[i]='>';
		    }
		    int count=0;
		    int i=0;
		    while(i<ch.length-1){
		        if((ch[i]=='>' && ch[i+1]=='<')){
		            count++;
		        }
		        i++;
		    }
		    System.out.println(count);
		}

	}
}
