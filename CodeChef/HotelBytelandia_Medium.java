// https://www.codechef.com/problems/HOTEL

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
		    int[] dep=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        dep[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    Arrays.sort(dep);
		    int i=0,j=0;
            int current=0,max=0;
            while(i<n && j<n){
                if(arr[i]<dep[j]){
                    current++;
                    max=Math.max(max,current);
                    i++;
                }else{
                    current--;
                    j++;
                }
            }
            
            System.out.println(max);
		}

	}
}
