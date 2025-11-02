// https://www.codechef.com/problems/SPBALL?tab=ide

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static final int MOD=1000000007;
    static final int MAX=10000000;
    static long[] fact=new long[MAX+1];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		fact[0]=1;
		for(int i=1;i<=MAX;i++){
		    fact[i]=(fact[i-1]*i)%MOD;
		}
		while(t-->0){
		    int n=input.nextInt();
		    ArrayList<Integer> list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        list.add(input.nextInt());
		    }
		    long sum=0;
		    for(int num:list){
		        sum=(sum+fact[num])%MOD;
		    }
		    System.out.println(sum);
		    
		}

	}
}
