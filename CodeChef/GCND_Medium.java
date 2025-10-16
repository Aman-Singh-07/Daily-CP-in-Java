// https://www.codechef.com/problems/GUCD

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0){
	        int n=input.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=input.nextInt();
	        }
	        Arrays.sort(arr);
	        int a=arr[n-1];
	        int b=arr[0];
	        int res=0;
	        if(b+1==a){
	            res=b-1;
	        }else{
	            res=a-1;
	        }
		    System.out.println(res);
	    }

	}
}
