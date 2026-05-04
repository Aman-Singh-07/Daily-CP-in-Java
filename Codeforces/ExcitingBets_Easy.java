// https://codeforces.com/contest/1543/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long a=input.nextLong();
		    long b=input.nextLong();
		    if(b > a) {
                long temp = a;
                a = b;
                b = temp;
            }
            if(a == b) System.out.println(0 + " " + 0);
            else {
            long ans = a - b;
            long min = Math.min(b % ans , ans - b % ans);
            System.out.println(ans + " " + min);
            }
		}

	}
}
