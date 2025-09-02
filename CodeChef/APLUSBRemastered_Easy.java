// https://www.codechef.com/problems/APLUSB

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
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    for(int i=0;i<n/2;i++){
		        int temp=b[i];
		        b[i]=b[n-i-1];
		        b[n-i-1]=temp;
		    }
		    HashSet<Integer> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        set.add(a[i]+b[i]);
		    }
		    if(set.size()!=1){
		        System.out.println(-1);
		    }
		    else{
		        for(int i=0;i<n;i++){
		            System.out.print(a[i]+" ");
		        }
		        System.out.println();
		        for(int j=0;j<n;j++){
		            System.out.print(b[j]+" ");
		        }
		        System.out.println();
		    }
		    
		}

	}
}
