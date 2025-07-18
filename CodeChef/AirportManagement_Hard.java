// https://www.codechef.com/problems/AIRM?tab=statement

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
		    int[] arr=new int[2*n];
		    for(int i=0;i<2*n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int count=1,max=0;
		    for(int i=0;i<2*n-1;i++){
		        if(arr[i]==arr[i+1]){
		            count++;
		        }else{
		            max=Math.max(max,count);
		            count=1;
		        }
		    }
		    max=Math.max(max,count);
		    System.out.println(max);
		}

	}
}
