// https://www.codechef.com/problems/JOINSTATE

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    ArrayList<Integer> list=new ArrayList<>();
		    int i=0;
		    while(i<n){
                int sum=0;
                while(i<n && sum<m){
                    sum+=arr[i];
                    i++;
                }
                if(sum>=m){
                    list.add(sum);
                }
            }
		    System.out.println(list.size());
		    
		}

	}
}
