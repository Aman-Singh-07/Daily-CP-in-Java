// https://www.codechef.com/problems/CHEFFED?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		long num=input.nextLong();
		long res=0;
		long s=Math.max(1,num-100);
		for(long i=s;i<=num;i++){
		    long j=digitSum(i);
		    long k=digitSum(j);
		    if(i+j+k==num) res++;
		}
		System.out.println(res);
		

	}
	
	public static long digitSum(long num){
	    long res=0;
	    while(num>0){
	        res+=num%10;
	        num/=10;
	    }
	    return res;
	}
}
