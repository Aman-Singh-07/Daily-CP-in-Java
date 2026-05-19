// https://codeforces.com/contest/500/problem/A

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
		int t=input.nextInt();
		int[] arr=new int[n];
		for(int i=1;i<=n-1;i++){
		    arr[i]=input.nextInt();
		}
		int res=1;
		while(res<t){
		    res+=arr[res];
		}
		if((res)==t) System.out.println("YES");
		else System.out.println("NO");

	}
}
