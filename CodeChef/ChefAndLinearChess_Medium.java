// https://www.codechef.com/problems/LINCHESS

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
		    int min=m;
		    int num=-1;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(m%x==0 && (m/x)<=min){
		            min=m/x;
		            num=x;
		        }
		    }
		    System.out.println(num);
		}

	}
}
