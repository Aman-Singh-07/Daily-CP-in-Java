// https://codeforces.com/problemset/problem/1476/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long n=input.nextLong();
            long k=input.nextLong();
            if(n==k) System.out.println(1);
            else if(n>k){
                if(n%k==0) System.out.println(1);
                else System.out.println(2);
                
            }else{
                long res=(k+n-1)/n;
                System.out.println(res);
            }
		}
	}
}
