// https://www.codechef.com/START188D/problems/SUBSUM3

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
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        if(arr[i]%3==0){
		            isTrue=true;
		            break;
		        }
		    }
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if((arr[i]+arr[j])%3==0){
		                isTrue=true;
		                break;
		            }
		            if (isTrue) break;
		        }
		    }
		    for(int k=0;k<n;k++){
		        for(int i=k+1;i<n;i++){
		            for(int j=i+1;j<n;j++){
		                if((arr[i]+arr[j]+arr[k])%3==0){
		                    isTrue=true;
		                    break;
		            }
		            if (isTrue) break;
		        }
		        if (isTrue) break;
		    }
		    }
		    
		    System.out.println(isTrue?"Yes":"No");
		    
		    
		}

	}
}
