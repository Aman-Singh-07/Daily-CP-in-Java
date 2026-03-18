// https://www.codechef.com/problems/EQBYXOR?tab=statement

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
		    long n=input.nextLong();
		    long req=a^b;
            if(a==b){
                System.out.println(0);
            }else if (req<n){
                System.out.println(1);
            }else{
                int msbReq=63-Long.numberOfLeadingZeros(req);
                int msbN=63-Long.numberOfLeadingZeros(n);
                if(msbReq<msbN){
                    System.out.println(2);
                }else if(msbReq==msbN && (n&(n-1))!=0){
                    System.out.println(2);
                }else{
                    System.out.println(-1);
                }
            }
		}

	}
}
