// https://www.codechef.com/problems/TAKENOTLESS?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
          int n=input.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
           arr[i]=input.nextInt();
          }
          Arrays.sort(arr);
          int count=1;
          int arr2[]=new int[n];
          int x=0;
          boolean flag=false;
          for(int i=n-1;i>0;i--){
            if(arr[i]==arr[i-1]){
                count++;
                flag=true;
            }
            else{
                arr2[x]=count;
                count=1;
                x++;
                flag=false;
            }
          }
        if(flag=true){
            arr2[x]=count;
        }
        flag=false;
        for(int i=0;i<n;i++){
            if(arr2[i]%2!=0){
                  flag=true;
                  break;
            }
        }
        System.out.println(flag?"Marichka":"Zenyk");
        }
	}
}
