// https://codeforces.com/contest/2217/problem/B

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
		    int[] a=new int[n+2];
		    
		    for(int i=1;i<n+1;i++) a[i]=input.nextInt();
		    int p=input.nextInt();
		    a[0]=a[n+1]=a[p];
		    int l=0;
		    int r=0;
		    for(int i=0;i<n+1;i++){
		        if(i<p){
		            if(a[i]!=a[i+1]) l++;
		        }
		        else{
		            if(a[i]!=a[i+1]) r++;
		        }
		    }
		    System.out.println(Math.max(l,r));
		    
		}
	}
}
