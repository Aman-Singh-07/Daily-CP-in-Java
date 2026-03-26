// https://www.codechef.com/problems/DBDISC?tab=statement

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
		    int k=input.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++) a[i]=input.nextInt();
		    for(int j=0;j<n;j++) b[j]=input.nextInt();
		    int max=0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            int num1=a[i];
		            int num2=a[j];
		            int cost=Math.max(num1,num2);
		            int taken=(cost/2>(cost-100))?cost/2:cost-100;
		            if(taken+Math.min(num1,num2)<=k){
		                max=Math.max(max,b[i]+b[j]);
		            }
		        }
		    }
		    System.out.println(max);
		}

	}
}
