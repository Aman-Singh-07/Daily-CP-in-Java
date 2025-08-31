//  https://www.codechef.com/problems/S10E?tab=ide

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
		    int count=0;
		    for(int i=0;i<n;i++){
		        boolean isTrue=true;
		        for(int j=Math.max(0,i-5);j<i;j++){
                    if(arr[j]<=arr[i]){
                        isTrue=false;
                        break;
                    }
                }
                if(isTrue) count++;
		    }
		    System.out.println(count);
		}

	}
}
