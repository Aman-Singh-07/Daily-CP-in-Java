// https://www.codechef.com/problems/WALK

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
		    int res=arr[0];
		    int req=0;
		    for(int i=1;i<n;i++){
		        res--;
		        if(res<arr[i]){
		            req+=arr[i]-res;
		            res+=arr[i]-res;
		        }
		    }
		    System.out.println(arr[0]+req);
		}

	}
}
