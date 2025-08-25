// https://www.codechef.com/problems/EQPAIR

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
		    long[] arr=new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		    }
		    int count=1;
		    Arrays.sort(arr);
		    long res=0;
		    for(int i=1;i<n;i++){
		        if(arr[i]==arr[i-1]){
		            count++;
		        }
		        else{
		            res+=(long) count*(count-1)/2;
		            count=1;
		        }
		    }
		    res+=(long) (count)*(count-1)/2;
		    System.out.println(res);
		}

	}
}
