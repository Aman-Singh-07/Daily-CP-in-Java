// https://www.codechef.com/problems/CHRECT?tab=statement

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
		    int k=input.nextInt();
		    if((n==1 && m<=2)  || (n<=2 && m==1)) System.out.println(0);
		    else if(n==1 || m==1) System.out.println(k);
		    else{
		        int count=0;
		        for(int i=1;i<=k;i+=2){
		            count++;
		        }
		        System.out.println(count);
		    }
		}

	}
}
