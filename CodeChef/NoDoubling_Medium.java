// https://www.codechef.com/problems/NODOUB?tab=statement

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
		    Long[] arr=new Long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		    }
		    Arrays.sort(arr);
		    int left=0;
		    int right=arr.length-1;
		    while(right>=left){
		        if(left==right){
		            System.out.print(arr[right]+" ");
		        }
		        else{ 
		            System.out.print(arr[right]+" ");
		            System.out.print(arr[left]+" ");
		        }
		        left++;
		        right--;
		    }
		    System.out.println();
		}

	}
}
