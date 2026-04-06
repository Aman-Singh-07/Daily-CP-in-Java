// https://www.codechef.com/problems/LOTTERYTICK

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
		    int num=arr[0];
		    int small=-1;
		    int large=-1;
		    Arrays.sort(arr);
		    for(int i=0;i<n;i++){
		        if(arr[i]==num){
		            if(i>0){
		                small=arr[i-1];
		            }
		            if(i<n-1){
		                large=arr[i+1];
		            }
		            break;
		            
		        }
		        
		    }
		    long res=0;
		    int upper=1000000;
		    int lower=1;
		    if(large!=-1){
		        upper=((large+num)/2);
		    }
		    if(small!=-1){
		        lower=(num+small+1)/2;
		    }
		    res+=upper-lower+1;
		    
		    System.out.println(res<0?0:res);
		}

	}
}
