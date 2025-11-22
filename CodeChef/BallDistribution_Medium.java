// https://www.codechef.com/problems/BLDST?tab=statement

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
		    int sum=0;
		    for(int i=0;i<m;i++){
		        int x=input.nextInt();
		        sum+=x;
		    }
		    if(sum<=(n*m)-n) System.out.println(0);
		    else System.out.println(n-(n*m)+sum);
		   
		    
		}

	}
}
