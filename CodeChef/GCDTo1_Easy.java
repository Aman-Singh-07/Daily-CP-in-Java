// https://www.codechef.com/problems/GCD_1

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
		    int m=input.nextInt();
		    ArrayList<Integer> list=new ArrayList<>();
		    int count=0;
		    int num=2;
		    while(count<n*m){
		        if(isPrime(num)){
		            list.add(num);
		            count++;
		        }
		        num++;
		    }
		    int k=0;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            System.out.print(list.get(k++)+" ");
		        }
		        System.out.println();
		    }
		    
		   
		}

	}
	
	public static boolean isPrime(int num){
	    if(num==2 || num==3) return true;
	    if(num%2==0 || num%3==0) return false;
	    for(int i=5;i*i<=num;i+=6){
	        if(num%i==0 || num%(i+2)==0) return false;
	    }
	    return true;
	}
}
