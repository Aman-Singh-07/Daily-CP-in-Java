// https://www.codechef.com/problems/NODDSM?tab=statement

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
		    int count2=0;
		    int count1=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x==2) count2++;
		        else count1++;
		    }
		    if(count1==0 || count2==0) System.out.println(0);
		    else if(count1%2!=0) System.out.println(count2);
		    else if(count1/2<count2) System.out.println(count1/2);
		    else System.out.println(count2);
		}

	}
}
