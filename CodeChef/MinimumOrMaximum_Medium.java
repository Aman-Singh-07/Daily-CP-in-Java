// https://www.codechef.com/problems/MINORMAX

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
		    int min=arr[0];
		    int max=arr[0];
		    boolean isTrue=true;
		    for(int i=1;i<n;i++){
		        if(arr[i]<=min){
		            min=arr[i];
		        }
		        if(arr[i]>=max) max=arr[i];
		        if(arr[i]!=min && arr[i]!=max){
		            isTrue=false;
		            break;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
