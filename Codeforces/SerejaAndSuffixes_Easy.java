// https://codeforces.com/problemset/problem/368/B

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
		int m=input.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=input.nextInt();
		HashSet<Integer> set=new HashSet<>();
		int[] res=new int[n];
		for(int i=n-1;i>=0;i--){
		    set.add(arr[i]);
		    res[i]=set.size();
		}
		for(int i=0;i<m;i++){
		    int x=input.nextInt();
		    System.out.println(res[x-1]);
		}

	}
}
