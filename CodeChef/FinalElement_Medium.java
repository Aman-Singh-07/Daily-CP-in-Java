// https://www.codechef.com/problems/FINELE

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
		    int res=0;
		    int idx=n-1;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++) arr[i]=input.nextInt();
		    for(int i=0;i<n;i++){
		        if((idx&i)==i) res=(res^arr[i]);
		    }
		    System.out.println(res);
		}

	}
}
