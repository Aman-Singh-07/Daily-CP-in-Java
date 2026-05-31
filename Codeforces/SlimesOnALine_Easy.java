// https://codeforces.com/problemset/problem/2229/A

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
		    int n=input.nextInt();
		    HashSet<Integer> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        int num=input.nextInt();
		        set.add(num);
		    }
		    int sum=0;
		    int max=Integer.MIN_VALUE;
		    int min=Integer.MAX_VALUE;
		    for(int num:set){
		        sum+=num;
		        max=Math.max(max,num);
		        min=Math.min(min,num);
		    }
		    System.out.println((max-min+1)/2);
		}

	}
}
