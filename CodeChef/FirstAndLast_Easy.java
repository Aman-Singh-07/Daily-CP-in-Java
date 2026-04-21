// https://www.codechef.com/problems/FIRSTANDLAST?tab=statement

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
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        a[i]=x;
		    }
		    int max=a[0]+a[n-1];
		    int sum=0;
		    for(int j=0;j<n-1;j++){
		        int temp=a[j]+a[j+1];
		        if(temp>sum){
		            sum=temp;
		        }
		    }
		    System.out.println(Math.max(max, sum));
		}

	}
}
