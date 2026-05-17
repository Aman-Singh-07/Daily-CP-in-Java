// https://www.codechef.com/problems/COKE

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
		    int k=input.nextInt();
		    int l=input.nextInt();
		    int r=input.nextInt();
		    int[][] arr=new int[n][2];
		    for(int i=0;i<n;i++){
		        arr[i][0]=input.nextInt();
		        arr[i][1]=input.nextInt();
		    }
		    Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
		    int res=-1;
		    for(int i=0;i<n;i++){
		        int temp=arr[i][0];
		        for(int j=0;j<m;j++){
		            if(temp>(k+1)) temp--;
		            else if(temp<(k-1)) temp++;
		            else temp=k;
		        }
		        if(temp<=r && temp>=l){
		            res=arr[i][1];
		            break;
		        }
		    }
		    System.out.println(res);
		    
		}

	}
}
