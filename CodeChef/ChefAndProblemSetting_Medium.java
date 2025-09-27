//  https://www.codechef.com/problems/PROBSET

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
		    int m=input.nextInt();
		    boolean isTrueWeak=false, isTrueWrong=false;
		    for(int i=0;i<n;i++){
		        String s1=input.next();
		        String s2=input.next();
		        if(s1.equals("correct")){
		            if(s2.contains("0")){
		                isTrueWrong=true;
		            }
		        }
		        else{
		            if(!s2.contains("0")){
		                isTrueWeak=true;
		            }
		        }
		    }
		    if(isTrueWrong) System.out.println("INVALID");
		    else if(isTrueWeak) System.out.println("WEAK");
		    else System.out.println("FINE");
		    
		    
		}

	}
}
