// https://www.codechef.com/problems/NONNEGSUM

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
		    long sum=0;
		    int x=0;
		    ArrayList<Integer> list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]>=0){
		            sum+=arr[i];
		            x++;
		        }else list.add(arr[i]);
		    }
		    Collections.sort(list);
		    for(int i=list.size()-1;i>=0;i--){
		        if((sum+list.get(i))>=0){
		            sum+=list.get(i);
		            x++;
		        }else break;
		    }
		    System.out.println(x);
		    
		}

	}
}
