//  https://www.codechef.com/problems/MODTEMP?tab=statement

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
		    int min=Integer.MAX_VALUE;
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        min=Math.min(min,x);
		        max=Math.max(max,x);
		        arr[i]=x;
		    }
		    int count=0;
		    for(int num:arr){
		        if(num!=min && num!=max) count++;
		    }
		    System.out.println(count);
		}

	}
}
