// https://www.codechef.com/problems/COUNTP

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
		    long sum=0;
		    int count=0;
		    for(int i=0;i<n;i++){ int x=input.nextInt();
		        sum+=x;
		        if(x%2==1) count++;
		    }
		    System.out.println(count==0?"No":(count%2==0 && sum%2==0)?"Yes":"No");
		}

	}
}
