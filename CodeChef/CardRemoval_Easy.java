// https://www.codechef.com/problems/REMOVECARDS

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int maxCount=0;
		    HashSet<Integer>  set=new HashSet<>();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        set.add(arr[i]);
		    }
		    for(int i:set){
		        int count=0;
		        for(int j:arr){
		            if(i==j) count++;
		        }
		        maxCount=Math.max(maxCount,count);
		    }
		    System.out.println(n-maxCount);
		}

	}
}
