// https://www.codechef.com/problems/HUNGALGO?tab=statement

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
		    int count1=0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            arr[i][j]=input.nextInt();
		        }
		    }
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if(arr[i][j]==0){
		                count1++;
		                break;
		            }
		        }
		    }
		    int count2=0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		            if(arr[j][i]==0){
		                count2++;
		                break;
		            }
		        }
		    }
		    System.out.println(count1==count2 && count1==n?"YES":"NO");
		}
	}
}
