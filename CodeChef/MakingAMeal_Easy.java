// https://www.codechef.com/problems/CFMM?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner (System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<n;i++){
		        sb.append(input.next());
		    }
		    String s=sb.toString();
		    int[] freq=new int[26];
		    for(char ch:s.toCharArray()){
		        freq[ch-'a']++;
		    }
		    int[] a=new int[6];
		    a[0]=freq['c'-'a'] / 2;
            a[1]=freq['o'-'a'];
            a[2]=freq['d'-'a'];
            a[3]=freq['e'-'a'] / 2;
            a[4]=freq['h'-'a'];
            a[5]=freq['f'-'a'];
		    int min=a[0];
		    for(int num:a){
		        if(num<min) min=num;
		    }
		    System.out.println(min);
		}

	}
}
