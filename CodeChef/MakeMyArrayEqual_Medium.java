//  https://www.codechef.com/problems/MEBA?tab=statement

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
		    int max=-1;
		    int count=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]==0) count++;
		        else {
		            max=arr[i];
		        }
		    }
		    int countRes=0;
		    for(int num:arr){
		        if(num!=0 && num==max){
		            countRes++;
		        }
		    }
		    System.out.println((countRes==(n-count))?"YES":"NO");
		}

	}
}
