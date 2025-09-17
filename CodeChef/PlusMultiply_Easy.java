// https://www.codechef.com/problems/PLMU?tab=statement

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
		    int count2=0;
		    int count0=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]==2) count2++;
		        if(arr[i]==0) count0++;
		    }
		    System.out.println(count2*(count2-1)/2 + count0*(count0-1)/2);
		    
		}

	}
}
