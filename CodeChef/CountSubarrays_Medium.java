// https://www.codechef.com/problems/COUNTSUB343?tab=statement

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
		    for(int i=0;i<n;i++) arr[i]=input.nextInt();
		    int[] res=new int[n+1];
            for(int i=0;i<n;i++){
                int currentSum=0;
                for(int j=i;j<n;j++){
                    currentSum+=arr[j];
                    if(currentSum>n){
                        break; 
                    }
                    res[currentSum]++;
                }
            }
            for(int i=1;i<res.length;i++) System.out.print(res[i]+" ");
		    System.out.println();
		}

	}
}
