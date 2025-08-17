// https://www.codechef.com/problems/STICKS?tab=statement

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
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int l=0,b=0;
            for(int i=n-1;i>0;i--){
                if(l==0 && arr[i]==arr[i-1]){
		            l=arr[i];
		            i--;
		            continue;
		        }
		        else if(arr[i]==arr[i-1]){
		            b=arr[i];
		            break;
		        }
            }
            if(l*b>0)
                System.out.println(l*b);
            else
                System.out.println(-1);
		}

	}
}
