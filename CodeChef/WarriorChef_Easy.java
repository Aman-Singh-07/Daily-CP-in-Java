// https://www.codechef.com/problems/WARRIORCHEF

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
		    int h=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int res=0;
		    for(int i=n-1;i>=0;i--){
		        if(arr[i]<h){
		            h-=arr[i];
		        }
		        else{
		            res=arr[i];
		            break;
		        }
		    }
		    System.out.println(res);
		}

	}
}
