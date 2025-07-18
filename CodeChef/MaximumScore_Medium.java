// https://www.codechef.com/problems/MAXSCORE7?tab=statement

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
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]==1){
		            count1++;
		        }
		        else count2++;
		    }
		    int count=Math.min(count1,count2);
		    System.out.println(Math.min(count,n/2));
		    
		    
		}

	}
}
