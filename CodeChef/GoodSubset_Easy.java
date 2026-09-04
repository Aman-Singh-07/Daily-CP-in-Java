// https://www.codechef.com/problems/GOODSUBSETEZ?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner fs=new Scanner(System.in);
        int t=fs.nextInt();
        while(t-->0){
            int n=fs.nextInt();
            int[] count=new int[33];
            for(int i=0;i<n;i++){
              long x=fs.nextLong();
              int len=64-Long.numberOfLeadingZeros(x);
              count[len]++;
            }
            int max=0;
            for(int cnt:count){
                max=Math.max(max,cnt);
            }
            System.out.println(max);
        }
	}
}
