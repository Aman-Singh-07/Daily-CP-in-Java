// https://www.codechef.com/problems/ADJSUMPAR

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
		    int sum=0;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        arr[i]=x;
		        sum+=x;
		    }
		    System.out.println((sum%2==0)?"YES":"NO");
		}

	}
}
