// https://codeforces.com/problemset/problem/2220/B

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
		    int m=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    boolean isTrue=true;
		    int count=1;
		    for(int i=1;i<n;i++){
		        if(arr[i]==arr[i-1]){
		            count++;
		            if(count>=m){
		                isTrue=false;
		                break;
		            }
		            
		        }
		        else count=1;
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
