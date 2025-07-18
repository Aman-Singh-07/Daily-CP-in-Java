// https://www.codechef.com/problems/ADDPERM

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
            if(k==1){
                for(int i=n;i>=1;i--){
                    System.out.print(i+" ");
                }
                System.out.println();
                continue;
            }
            if(k==n){
                for(int i=1;i<=n;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                continue;
            }
            int index=0;
            for(int i=n-k+1;i>=1;i--){
                arr[index++]=i;
            }
            for(int i=n-k+2;i<=n;i++){
                arr[index++]=i;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
