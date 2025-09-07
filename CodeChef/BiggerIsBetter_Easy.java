// https://www.codechef.com/problems/BIGNAME

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
		    String str=input.next();
		    String s=str;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)!='z'){
		            s=s.replace(Character.toString(s.charAt(i)),"z");
		        }
		    }
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)>str.charAt(i)){
		            isTrue=true;
		            break;
		        }
		    }
		    System.out.println(isTrue?s:-1);
		    
		}

	}
}
