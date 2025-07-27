// https://www.codechef.com/problems/SPALNUM

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
		    int l=input.nextInt();
		    int r=input.nextInt();
		    int sum=0;
		    for(int i=l;i<=r;i++){
		        if(isPalindrom(i)){
		            sum+=i;
		        }
		        
		    }
		    System.out.println(sum);
		}

	}
	
	public static boolean isPalindrom(int n){
	    int temp=n;
	    int res=0;
	    while(temp>0){
	        res=res*10+temp%10;
	        temp/=10;
	    }
	    return res==n;
	}
}
