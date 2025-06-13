// https://www.codechef.com/problems/APPROVAL

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
		    int[] arr=new int[5];
		    int sum=0;
		    for(int i=0;i<5;i++){
		        arr[i]=input.nextInt();
		        sum+=arr[i];
		    }
		    if(sum>=35){
		        System.out.println(0);
		    }
		    else{
		        int result=0;
		        Arrays.sort(arr);
		        while(sum<35){
		            sum+=10-arr[0];
		            arr[0]=10;
		            Arrays.sort(arr);
		            result+=100;
		        }
		        System.out.println(result);
		    }
		    
		    
		}

	}
}
