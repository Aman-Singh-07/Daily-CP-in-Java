// https://codeforces.com/problemset/problem/1559/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int res=input.nextInt();
		    for(int i=0;i<n-1;i++){
		        int x=input.nextInt();
		        res=res&x;
		        
		    }
		    System.out.println(res);
		}

	}
}
