// https://codeforces.com/problemset/problem/2225/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long x=input.nextLong();
		    long y=input.nextLong();
		    long z=x+x;
		    boolean isTrue=false;
		    while(z<y){
		        if(y%(z)!=0 && (z)%x==0){
		            isTrue=true;
		            break;
		        }else{
		            z+=x;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		    
		    
		}

	}
}
