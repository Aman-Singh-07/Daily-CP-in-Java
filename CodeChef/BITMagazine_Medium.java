// https://www.codechef.com/problems/TRMAG?tab=statement

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
            long n=input.nextLong();
            int count=input.nextInt();
            long[] pages=new long[count];
            for(int i=0;i<count;i++) pages[i]=input.nextLong();
            double removed=input.nextDouble();
            double total=n*(n+1)/2;
            for(long v:pages) total-=v;
            double avgSum=(n*(n+1)/2)/n;
            System.out.printf("%.4f\n", (total*(avgSum-removed)/avgSum));
        }
	}
}
