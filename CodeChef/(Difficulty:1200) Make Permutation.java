// https://www.codechef.com/problems/MAKEPERM

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
		    Arrays.sort(arr);
		    int[] res=new int[n];
		    for(int i=1;i<=n;i++){
		        res[i-1]=i;
		    }
		    boolean isTrue=true;
		    for(int i=0;i<n;i++){
		        if(res[i]<arr[i]){
		            isTrue=false;
		            break;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		    
		}

	}
}
