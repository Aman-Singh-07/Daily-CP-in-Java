// https://www.codechef.com/problems/P2HOME?tab=statement

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
		    boolean isTrue=true;
		    for(int i=0;i<n-1;i++){
		        if((a[i]<a[i+1] && b[i]>b[i+1])  || (a[i]>a[i+1] && b[i]<b[i+1])){
		            isTrue=false;
		            break;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
