// https://codeforces.com/problemset/problem/2008/A

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    if(b%2==0){
		        if(a%2==0) System.out.println("YES");
		        else System.out.println("NO");
		    }else{
		        if(a>=2){
		            a-=2;
		            if(a%2==0) System.out.println("YES");
		            else System.out.println("NO");
		        }
		        else System.out.println("NO");
		    }
		}

	}
}
