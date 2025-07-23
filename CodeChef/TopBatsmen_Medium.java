// https://www.codechef.com/problems/BESTBATS

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int[] arr=new int[11];
		    for(int i=0;i<11;i++){
		        arr[i]=input.nextInt();
		    }
		    int k=input.nextInt();
		    Arrays.sort(arr);
		    int[] res=new int[k];
		    int j=0;
		    for(int i=10;i>=11-k;i--){
		        res[j++]=arr[i];
		    }
		    
		    int countReq=0;
		    for(int i=0;i<k;i++){
		        if(res[i]==res[k-1]) countReq++;
		    }
		    int countHave=0;
		    for(int i=0;i<11;i++){
		        if(arr[i]==res[k-1]) countHave++;
		    }
		    System.out.println(nCr(countHave,countReq));
		}

	}
	
	public static BigInteger fact(int n){
        BigInteger res=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
	
	 public static BigInteger nCr(int n,int r){
        return fact(n).divide(fact(r).multiply(fact(n - r)));
    }
}
