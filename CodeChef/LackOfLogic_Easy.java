// https://www.codechef.com/problems/NOLOGIC?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		char [] uppercase=new char[26];
        for (int i=65;i<=90;i++) {
            uppercase[i-65]=(char)i;
        }
		int t=input.nextInt();
		input.nextLine();
		while(t-->0){
		    String line=input.nextLine().toUpperCase();
		    if(line.length()>0){
               String newStr="";
               for(int i=0;i<26;i++){
                   if(line.contains(""+uppercase[i])){
                   }
                   else{
                       newStr+=uppercase[i];
                   }
               }
               if(newStr.length()>0){
                   System.out.println(newStr);
               }
               else{
                   System.out.println("~");
               }
           }
		}

	}
}
