// https://www.codechef.com/problems/KMAX2

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
		    int k=input.nextInt();
		    int[] arr=new int[n];
		    int maxVal=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]>maxVal){
                    maxVal=arr[i];
                }
            }
            long count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==maxVal){
                    int L=i-(k-1);
                    if(L>=0){
                        count+=(n-i);
                    }
                }
            }
            System.out.println(count);
		}
	}
}
