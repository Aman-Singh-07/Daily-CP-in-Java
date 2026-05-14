// https://www.codechef.com/problems/MNMXQR?tab=statement

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
		    int q=input.nextInt();
		    int[] arr=new int[n+1];
		    for(int i=1;i<=n;i++) arr[i]=input.nextInt();
		    for(int i=0;i<q;i++){
		        int a=input.nextInt();
		        int b=input.nextInt();
		        int c=input.nextInt();
		        if(a==1) arr[b]=c;
		        else{
		            int len=c-b+1;
		            if(len==1) System.out.println(arr[b]);
		            else if(len%2==0){
		                int mid=(c+b)/2;
		                System.out.println(Math.max(arr[mid],arr[mid+1]));
		            }else{
		                int mid=(c+b)/2;
		                System.out.println(Math.max(Math.min(arr[mid],arr[mid-1]),Math.min(arr[mid],arr[mid+1])));
		            }
		        }
		    }
		}

	}
}
