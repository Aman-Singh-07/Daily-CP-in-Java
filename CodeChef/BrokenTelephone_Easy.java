// https://www.codechef.com/problems/BROKPHON

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    HashSet<Integer> count=new HashSet<>();
		    for(int i=0;i<n-1;i++){
		        if(arr[i]!=arr[i+1]){
		            count.add(i);
		            count.add(i+1);
		        }
		    }
		    System.out.println(count.size());
		}

	}
}
