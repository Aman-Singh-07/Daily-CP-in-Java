// https://www.codechef.com/problems/ENDSORTED?tab=statement

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
		    int pos1=0;
		    int posN=0;
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        if(arr[i]==1) pos1=i;
		        else if(arr[i]==n) posN=i;
		    }
		    System.out.println(pos1+((pos1>posN)?(n-2-posN):(n-1-posN)));
		    
		}

	}
}
