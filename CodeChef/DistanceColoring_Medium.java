// https://www.codechef.com/problems/DISTANCECOLO

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
		int MOD=1000000007;
		while(t-->0){
		    int n=input.nextInt();
		    int k=input.nextInt();
		    long res=1;
		    for(int i=0;i<n;i++){
		        if((k-i)>0) res=(res*(k-i))%MOD;
		        else break;
		    }
		    System.out.println(res);
		}

	}
}
