// https://www.codechef.com/problems/MINGCD_1?tab=statement

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
		    int[][] arr=new int[n][m];
		    for(int j=0;j<n;j++){
		        for(int k=0;k<m;k++){
		            if(k==j){
		                arr[j][k]=3;
		            }else{
		                arr[j][k]=2;
		            }
		        }
		    }
		    if(n<m){
		        for(int j=n;j<m;j++){
		            arr[0][j]=3;
		        }
		    }
		    if(m<n){
		        for(int j=m;j<n;j++){
		            arr[j][0]=3;
		        }
		    }
		    for(int j=0;j<n;j++){
		        for(int k=0;k<m;k++){
		            System.out.print(arr[j][k]+" ");
		        }
		        System.out.println();
		    }
		}
	}
}
