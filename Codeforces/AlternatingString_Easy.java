// https://codeforces.com/problemset/problem/2225/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int count=0;
		    String s=input.next();
		    for(int i=1;i<s.length();i++){
		        if(s.charAt(i-1)==s.charAt(i)){
		            count++;
		        }
		    }
		    System.out.println(count>2?"NO":"YES");
		}
	}
}
