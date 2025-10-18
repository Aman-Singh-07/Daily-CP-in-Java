// https://www.codechef.com/problems/LPSS?tab=statement

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
		    int[] arr=new int[3];
		    int sum=0;
		    for(int i=0;i<3;i++){
		        arr[i]=input.nextInt();
		        sum+=arr[i];
		    }
		    Arrays.sort(arr);
		    if(arr[0]%2!=0 && arr[1]%2!=0) System.out.println(arr[0]+arr[1]-1);
		    else System.out.println(arr[0]+arr[1]);
		}

	}
}
