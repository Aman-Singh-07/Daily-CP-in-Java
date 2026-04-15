// https://www.codechef.com/problems/NPRPE

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
		    if(n==1 || n==2){
		        System.out.println("-1");
		        continue;
		    }
		    int oddSum=(n%2==0)?n-1:n;
		    oddSum+=1;
		    int evenSum=(n%2==0)?n:n-1;
		    evenSum+=2;
		    for(int i=0;i<n;i++){
		        if(arr[i]%2==0){
		            System.out.print(evenSum-arr[i]+" ");
		        }else{
		            System.out.print(oddSum-arr[i]+" ");
		        }
		    }
		    System.out.println();
		}

	}
}
