// https://www.codechef.com/problems/ROCPAPSCI

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
		    int res=n;
		    String s=input.next();
		    for(int i=0;i<n-1;i++){
		        if(s.charAt(i)==s.charAt(i+1)){
		            res--;
		            i++;
		        }
		        
		    }
		    System.out.println(res);
		}

	}
}
