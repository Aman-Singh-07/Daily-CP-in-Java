// https://www.codechef.com/problems/EZSPEAK

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
		    String comp="aeiou";
		    int len=input.nextInt();
		    String given=input.next();
		    int currentCount=0;
		    for(int i=0;i<len;i++){
		        if(!comp.contains(String.valueOf(given.charAt(i)))){
		            currentCount++;
		            if(currentCount>=4) break;
		        }
		        else{
		            currentCount=0;
		        }
		    }
		    System.out.println((currentCount>=4)?"NO":"YES");
		}

	}
}
