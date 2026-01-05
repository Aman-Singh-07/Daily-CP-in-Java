// https://www.codechef.com/problems/KARR?tab=statement

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
		    int[] temp=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        temp[i]=arr[i];
		    }
		    Arrays.sort(temp);
		    int max=0;
		    for(int i=0;i<n;i++){
		        if(temp[i]!=arr[i]) max=Math.max(arr[i],max);
		    }
		    if(max==0) System.out.println(0);
		    else System.out.println(max+1);
		}
		

	}
}
