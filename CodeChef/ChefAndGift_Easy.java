// https://www.codechef.com/problems/PRGIFT?tab=statement

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
		    int k=input.nextInt();
		    int count=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x%2==0) count++;
		    }
		    if(k==0 && n==count) System.out.println("NO");
		    else System.out.println(count>=k?"YES":"NO");
		}

	}
}
