// https://www.codechef.com/problems/FASTFOOD

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
		    int[] b=new int[n];
		    int sum1=0;
		    int sum2=0;
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		        sum1+=a[i];
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		        sum2+=b[i];
		    }
		    int[] preA=new int[n];
		    int[] suffB=new int[n];
		    preA[0]=a[0];
		    suffB[n-1]=b[n-1];
		    for(int i=1;i<n;i++){
		        preA[i]=preA[i-1]+a[i];
		    }
		    for(int i=n-2;i>=0;i--){
		        suffB[i]=suffB[i+1]+b[i];
		    }
		    int max=Math.max(sum1,sum2);
		    for(int i=0;i<n-1;i++){
		        int num=preA[i]+suffB[i+1];
		        max=Math.max(num,max);
		    }
		    System.out.println(max);
		}

	}
}
