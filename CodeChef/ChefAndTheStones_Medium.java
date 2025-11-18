//  https://www.codechef.com/problems/CHEFST?tab=statement

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
            long n1=input.nextLong();
            long n2=input.nextLong();
            long m=input.nextLong();
            long sum=(m*(m+1))/2;
            long diff=Math.abs(n1-n2);
            if(Math.min(n1,n2)<sum){
                System.out.println(diff);
            }else{
                System.out.println(n1+n2-(2*sum));
            }
        }
	}
}
