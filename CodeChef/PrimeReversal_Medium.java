// https://www.codechef.com/problems/PRIMEREVERSE?tab=statement

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
		    String s1=input.next();
		    String s2=input.next();
		    if(s1.equals(s2)) System.out.println("YES");
		    else{
		        int countS11=0;
		        int countS21=0;
		        for(int i=0;i<n;i++){
		            if(s1.charAt(i)=='1') countS11++;
		            if(s2.charAt(i)=='1') countS21++;
		        }
		        if(countS21!=countS11) System.out.println("NO");
		        else{
		            System.out.println("YES");
		        }
		    }
		}

	}
}
