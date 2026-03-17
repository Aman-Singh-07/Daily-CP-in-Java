// https://www.codechef.com/problems/SPACEARR?tab=statement

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
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    int count=0;
		    boolean isPossible=true;
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>(i+1)){
                    isPossible=false;
                    break;
                }
                count+=(long)((i+1)-arr[i]);
		    }
		    if(!isPossible){
		        System.out.println("Second");
		    }
		    else System.out.println(count%2==0?"Second":"First");
		    
		    
		}

	}
}
