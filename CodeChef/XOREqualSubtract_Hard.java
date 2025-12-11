// https://www.codechef.com/START216C/problems/XORSUB7

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
                long[] arr=new long[n];
                for(int i=0;i<n;i++){
                    arr[i]=input.nextLong();
                }
                Arrays.sort(arr);
                int[] res=new int[n];
                int max=1;
                for(int i=0;i<n;i++){
                    res[i]=1; 
                    for(int j=0;j<i;j++){
                        if((arr[i]&arr[j])==arr[j]){
                            res[i]=Math.max(res[i],res[j]+1);
                        }
                    }
                    max=Math.max(max,res[i]);
                }
                
                System.out.println(max);
            }
    }
}
