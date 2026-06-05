// https://codeforces.com/problemset/problem/1840/C

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
		    long k=input.nextLong();
		    long q=input.nextLong();
		    ArrayList<Long> list=new ArrayList<>();
		    long count=0;
		    for(int i=0;i<n;i++){
		        long x=input.nextLong();
		        if(x<=q) count++;
		        else{
		            if(count>=k) list.add(count-k+1);
		            count=0;
		        }
		    }
		    if(count>=k) list.add(count-k+1);
		    count=0;
		    for(long num:list){
		        if(num>1) count+=(num*(num+1))/2;
		        else count++;
		    }
		    System.out.println(count);
		}

	}
}
