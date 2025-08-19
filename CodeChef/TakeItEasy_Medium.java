// https://www.codechef.com/problems/TIES?tab=statement

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
		    int sum=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        sum+=arr[i];
		    }
		    if(sum%n!=0){
		        System.out.println("No");
		    }
		    else{
		        sum=0;
		        for(int num:arr){
		            sum+=num/2;
		        }
		        if(sum%n==0){
		            System.out.println("Yes");
		        }
		        else System.out.println("No");
		    }
		    
		}

	}
}
