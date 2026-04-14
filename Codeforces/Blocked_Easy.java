// https://codeforces.com/contest/2220/problem/A

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
		    for(int i=0;i<n;i++) arr[i]=input.nextInt();
		    Arrays.sort(arr);
		    boolean isTrue=true;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]==arr[i+1]){
		            isTrue=false;
		            break;
		        }
		    }
		    if(!isTrue) System.out.println("-1");
		    else{
		        for(int i=n-1;i>=0;i--){
		            System.out.print(arr[i]+" ");
		        }
		        System.out.println();
		    }
		}

	}
}
