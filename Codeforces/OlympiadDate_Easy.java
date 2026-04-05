// https://codeforces.com/problemset/problem/2091/A

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
		    int[] arr=new int[10];
		    boolean isTrue=false;
		    int res=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        arr[x]++;
		        if(arr[0]>=3 && arr[3]>=1 && arr[1]>=1 && arr[2]>=2 && arr[5]>=1 && !isTrue){
		            res=i+1;
		            isTrue=true;
		        }
		    }
		    System.out.println(res);
		    
		}

	}
}
