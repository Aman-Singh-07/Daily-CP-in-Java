// https://www.codechef.com/problems/LCOLLIS

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
		    char[][] arr=new char[n][m];
		    for(int i=0;i<n;i++){
		        String row=input.next();
		        for(int j=0;j<m;j++){
		            arr[i][j]=row.charAt(j);
		        }
		    }
		    int res=0;
		    for(int i=0;i<m;i++){
		        int sum=0;
		        for(int j=0;j<n;j++){
		            if(arr[j][i]=='1') sum++;
		        }
		        res+=nCr(sum);
		    }
		    System.out.println(res);
		}

	}
	
	public static int nCr(int n){
	    if(n<=1) return 0;
	    return n*(n-1)/2;
	}
}
