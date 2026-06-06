// https://codeforces.com/problemset/problem/519/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long sum1=0;
		long sum2=0;
		long sum3=0;
		for(int i=0;i<n;i++){
		    sum1+=input.nextLong();
		}
		for(int j=0;j<n-1;j++){
		    sum2+=input.nextLong();
		}
		for(int k=0;k<n-2;k++){
		    sum3+=input.nextLong();
		}
		System.out.println((sum1-sum2));
		System.out.println((sum2-sum3));

	}
}
