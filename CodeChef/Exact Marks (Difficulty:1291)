// https://www.codechef.com/problems/GENIUS

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
		    int x=input.nextInt();
		    boolean isTrue=false;
		    int minA=Math.max(0,(x+2)/3);
        int maxA=Math.min(n,(n+x)/4);
		    for(int a=minA;a<=maxA;a++){
		        int b=3*a-x;
		        int c=n-a-b;
		    
		        if(b>=0 && c>=0 && a+b+c==n){
		            System.out.println("YES");
		            isTrue=true;
		            System.out.println(a+" "+b+" "+c);
		            break;
		        }
		    }
		    if(!isTrue){
		        System.out.println("NO");
		    }
		    
		}

	}
}
