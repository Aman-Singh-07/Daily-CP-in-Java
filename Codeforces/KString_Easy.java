// https://codeforces.com/problemset/problem/219/A

// Attention: Use Java 11 or higher to run this code successfully.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		String s=input.next();
		int[] freq=new int[26];
		for(char ch:s.toCharArray()){
		    freq[ch-'a']++;
		}
		int min=Integer.MAX_VALUE;
		boolean isNot=false;
		for(int i=0;i<26;i++){
		    if(freq[i]%k!=0) isNot=true;
		}
		
		boolean isTrue=true;
		String finalResult="";
		if(isNot) isTrue=false;
		else{
		    for(int i=0;i<26;i++){
		        freq[i]=freq[i]/k;
		    }
		    StringBuilder sb=new StringBuilder();
		    for(int i=0;i<26;i++){
		        if(freq[i]>0) sb.append(String.valueOf((char)(i+'a')).repeat(freq[i]));
		    }finalResult=sb.toString().repeat(k);
		}
		System.out.println(isTrue?finalResult:"-1");
		

	}
}
