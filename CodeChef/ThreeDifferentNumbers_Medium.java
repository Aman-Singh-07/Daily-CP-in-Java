// https://www.codechef.com/problems/THREEDIF

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
		    long[] a=new long[3];
		    a[0]=input.nextLong();
		    a[1]=input.nextLong();
		    a[2]=input.nextLong();
		    Arrays.sort(a);
		    long MOD=1000000007;
		    long one=a[0]%MOD;
		    long two=(a[1]-1)%MOD;
		    long three=(a[2]-2)%MOD;
		    long res=(one*two)%MOD;
		    res=(res*three)%MOD;
		    System.out.println(res%MOD);
		    
		    
		}

	}
}
