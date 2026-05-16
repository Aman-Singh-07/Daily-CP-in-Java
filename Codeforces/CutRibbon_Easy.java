// https://codeforces.com/problemset/problem/189/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		    int n=input.nextInt();
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    int[] dp=new int[n+1];
		    dp[0]=0;
		    for(int i=1;i<=n;i++){
		        dp[i]=-1;
		        if(i-a>=0) dp[i]=Math.max(dp[i],dp[i-a]);
		        if(i-b>=0) dp[i]=Math.max(dp[i-b],dp[i]);
		        if(i-c>=0) dp[i]=Math.max(dp[i-c],dp[i]);
		        if(dp[i]!=-1) dp[i]++;
		    }
		    System.out.println(dp[n]);

	}
}
