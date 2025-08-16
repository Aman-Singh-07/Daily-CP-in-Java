// https://www.codechef.com/problems/LEPERMUT

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
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(arr[i]>arr[j]) count1++;
		        }
		    }
		    for(int i=1;i<n;i++){
		        if(arr[i]<arr[i-1]) count2++;
		    }
		    System.out.println(count1==count2?"YES":"NO");
		}

	}
}
