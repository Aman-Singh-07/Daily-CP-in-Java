// https://www.codechef.com/problems/PATH3

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
		    if(n<=2) System.out.println("-1");
		    else{
		        int[][] arr=new int[n+1][n+1];
		        for(int j=1;j<=(n-2);j++){
		            arr[1][j]=1;
		        }
		        for(int i=1;i<=(n-2);i++){
		            arr[i][n-2]=1;
		        }
		        for(int j=n-2;j<=n;j++){
		            arr[n-2][j]=1;
		        }
		        for(int i=n-1;i<=n;i++){
		            for(int j=n-1;j<=n;j++){
		                arr[i][j]=1;
		            }
		        }
		        for(int i=1;i<=n;i++){
		            for(int j=1;j<=n;j++){
		                System.out.print(arr[i][j]+" ");
		            }
		            System.out.println();
		        }
		    }
		}

	}
}
