// https://www.codechef.com/problems/MXPARREZ?tab=statement

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
		    int x=input.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=input.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		    }
		    int[] maxA=new int[n+1];
		    maxA[n]=0;
		    for(int i=n-1;i>=0;i--){
		        maxA[i]=Math.max(a[i],maxA[i+1]);
		    }
		    int maxParry=0;
		    boolean parryIt=true;
		    for(int i=0;i<n;i++){
		        if(a[i]>x){
		            parryIt=false;
		            break;
		        }
		        else if(x>=b[i] && (x-1)>=maxA[i+1]){
		                maxParry++;
		                x--;
		        }
		    }
		    System.out.println((parryIt)?maxParry:0);
		    
		}

	}
}
