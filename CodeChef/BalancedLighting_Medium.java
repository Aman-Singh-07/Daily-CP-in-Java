https://www.codechef.com/problems/RBLT

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
		    int redCount=0;
		    int blueCount=0;
		    int nonCount=0;
		    for(int i=0;i<n;i++){
		        int color=input.nextInt();
		        if(color==1) redCount++;
		        else if(color==2) blueCount++;
		        else nonCount++;
		    }
		    if(n%2!=0){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println(Math.max(redCount,blueCount)-Math.min(redCount,blueCount)<=nonCount?"YES":"NO");
		    }
		}

	}
}
