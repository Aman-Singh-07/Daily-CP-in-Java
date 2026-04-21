// https://codeforces.com/problemset/problem/1806/A

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
		    long a=input.nextLong();
		    long b=input.nextLong();
		    long c=input.nextLong();
		    long d=input.nextLong();
		    if(d<b || (a+d-b)<c){
                System.out.println("-1");
            }else{
                long h=d-b;
                long x=a+h;
                long m=x-c;
                
                System.out.println(h+m);
            }
		}

	}
}
