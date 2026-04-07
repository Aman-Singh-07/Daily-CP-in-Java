// https://www.codechef.com/problems/RESTORE?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{ 
    static int max=4000000;
    static List<Integer> primes=new ArrayList<>();
    public static void sieve(){
	    int[] isPrime=new int[max+1];
	    Arrays.fill(isPrime,1);
	    isPrime[0]=0;
	    isPrime[1]=0;
	    for(int i=2;i*i<=max;i++){
	        if(isPrime[i]==1){
	            for(int j=i*i;j<=max;j+=i){
	                isPrime[j]=0;
	            }
	        }
	    }
	    for(int i=2;i<=max;i++){
	        if(isPrime[i]==1) primes.add(i);
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		sieve();
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int[] b=new int[n];
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		        a[i]=primes.get(i);
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(i==b[i]-1?a[i]+" ":a[b[i]-1]+" ");
		    }
		    System.out.println();
		}

	}
	
}
