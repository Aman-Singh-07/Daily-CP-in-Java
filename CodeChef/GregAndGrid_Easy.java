// https://www.codechef.com/problems/GREG

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPrime(long num){
        if(num<2) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(long i=5;i*i<=num;i+=2){
            if(num%(i)==0 || num%(i+2)==0) return false;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		long n=input.nextInt();
		long m=input.nextInt();
		long res=m+n;
		long[] arr=new long[(int) res];
		int j=0;
        for(long i=2;i<=res;i++){
            if(isPrime(i)) arr[j++]=i;
        }
		int i=0;
		while(i<arr.length && res>=arr[i]){
		    if(arr[i]==0) break;
		    i++;
		}
		System.out.println(i);

	}
}
