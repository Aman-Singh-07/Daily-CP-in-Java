// https://www.codechef.com/problems/CYCLICXOR7?tab=statement

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
		long MOD=998244353;
		while(t-->0){
		    long n=input.nextLong();
		    long k=input.nextLong();
		    if(n%3!=0) System.out.println("1");
		    else{
		        long gcdNum=gcd(n,1L<<k);
		        long res=(gcdNum*k)%MOD;
		        long power=res/10;
		        long rem=res%10;
		        long ans=1;
		        for(int i=0;i<20;i++){
		            ans=(ans*pow(2,power))%MOD;
		        }
		        ans=(ans*pow(2,rem))%MOD;
		        ans=(ans*pow(2,rem))%MOD;
		        System.out.println(ans%MOD);
		        
		        
		    }
		}

	}
	public static long gcd(long a,long b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
	public static long pow(long base,long exp){
	    long MOD=998244353;
        long res=1;
        base=base%MOD;
        while(exp>0){
            if(exp%2==1){
                res=(res*base)%MOD;
            }
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
	}
}
