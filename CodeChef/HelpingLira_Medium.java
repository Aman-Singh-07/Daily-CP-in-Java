// https://www.codechef.com/problems/HELPLIRA

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
		double[] arr=new double[t];
		for(int i=0;i<t;i++){
		    int x1=input.nextInt();
		    int y1=input.nextInt();
		    int x2=input.nextInt();
		    int y2=input.nextInt();
		    int x3=input.nextInt();
		    int y3=input.nextInt();
		    int a=x1*((y2-y3));
		    int b=x2*((y3-y1));
		    int c=x3*((y1-y2));
		    arr[i]=Math.abs((a+b+c))/2.0;
		}
		double min=arr[0];
		int indexMin=0;
		int indexMax=0;
		double max=arr[0];
		for(int i=0;i<t;i++){
		    if(arr[i]<=min){
		        min=arr[i];
		        indexMin=i;
		    }
		    if(arr[i]>=max){
		        max=arr[i];
		        indexMax=i;
		    }
		    
		}
		System.out.print((indexMin+1)+" "+(indexMax+1));

	}
}
