// https://codeforces.com/contest/2217/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int k=input.nextInt();
		    int mux=n*k;
		    long sum=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        sum+=x;
		    }
		    if(sum%2!=0  || mux%2==0) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
