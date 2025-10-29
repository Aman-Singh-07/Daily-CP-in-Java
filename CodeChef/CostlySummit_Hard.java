// https://www.codechef.com/problems/LSU?tab=statement

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
            int c=input.nextInt();
            int[] freq=new int[5];
            for(char ch:input.next().toCharArray()) 
                freq[ch-'A']++;
            Arrays.sort(freq);
            int rem=n;
            int res=Integer.MAX_VALUE;
            for(int i=5;i>=0;i--){
                int trans=(rem*(rem+1))/2;
                res=Math.min(res,(5-i)*c+trans);
                if(i>0) rem-=freq[i-1];
            }
            System.out.println(res);
        }
	}
}
