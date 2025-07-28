// https://www.codechef.com/problems/FFL

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
		    int s=input.nextInt();
		    int minD=100, minF=100;
		    int[] p=new int[n];
		    for(int i=0;i<n;i++){
		        p[i]=input.nextInt();
		    }
		    int[] ab=new int[n];
		    for(int i=0;i<n;i++){
		        ab[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        if(ab[i]==0 && p[i]<minD) minD=p[i];
		        if(ab[i]==1 && p[i]<minF) minF=p[i];
		    }
		    System.out.println((s+minD+minF)<=100?"yes":"no");
		}

	}
}
