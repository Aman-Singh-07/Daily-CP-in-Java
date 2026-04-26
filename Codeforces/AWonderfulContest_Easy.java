// https://codeforces.com/contest/2222/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x==100) isTrue=true;
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
