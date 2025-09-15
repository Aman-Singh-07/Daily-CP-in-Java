// https://www.codechef.com/problems/GRIDXOR

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
		    int[][] arr=new int[n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            arr[i][j]=1;
		            System.out.printf(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
		}

	}
}
