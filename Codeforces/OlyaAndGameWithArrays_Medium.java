// https://codeforces.com/contest/1859/problem/B

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
		    long min=Long.MAX_VALUE;
		    ArrayList<Long> list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        int m=input.nextInt();
		        long minF=Long.MAX_VALUE;
		        long minS=Long.MAX_VALUE;
		        for(int j=0;j<m;j++){
		            long num=input.nextLong();
		            if(num<minF){
		                minS=minF;
		                minF=num;
		            }
		            else if(num<minS && num>=minF){
		                minS=num;
		            }
		        }
		        min=Math.min(min,minF);
		        list.add(minS);
		    }
		    long sum=0;
		    long minL=Long.MAX_VALUE;
		    for(long num:list){
		        sum+=num;
		        minL=Math.min(minL,num);
		    }
		    sum-=minL;
		    sum+=min;
		    System.out.println(sum);
		}

	}
}
