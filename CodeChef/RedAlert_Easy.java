// https://www.codechef.com/problems/REDALERT

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
		    int d=input.nextInt();
		    int h=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int res=0;
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        if(arr[i]>0) res+=arr[i];
		        else if(arr[i]==0){
		            if(res<=d) res=0;
		            else res-=d;
		        }
		        if(res>h){
		            isTrue=true;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}

