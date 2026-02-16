// https://www.codechef.com/problems/ARRANGE

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
		    int k=input.nextInt();
		    int n=1<<k;
		    String s=input.next();
		    char[] st=s.toCharArray();
		    char[] r=new char[n];
		    for(int i=0;i<n;i++){
		        int idx=i;
		        int res=0;
		        for(int j=0;j<k;j++){
		            res=res<<1;
		            res=res|(idx&1);
		            idx=idx>>1;
		        }
		        r[res]=st[i];
		 
		    }
		    String str=new String(r);
		    System.out.println(str);
		}

	}
}
