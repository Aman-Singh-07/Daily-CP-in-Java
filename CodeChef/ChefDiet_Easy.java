// https://www.codechef.com/problems/DIET

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
		    int k=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int current=0;
		    boolean isTrue=true;
		    for(int i=0;i<n;i++){
		        current+=arr[i];
		        if(current>=k) current-=k;
		        else{
		            System.out.println("NO "+(i+1));
		            isTrue=false;
		            break;
		        }
		    }
		    if(isTrue) System.out.println("YES");
		}

	}
}
