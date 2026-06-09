// https://codeforces.com/problemset/problem/1303/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    String s=input.next();
		    int idx1=-1;
		    int idx2=-1;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='1'){
		            idx1=i;
		            break;
		        }
		    }
		    for(int i=s.length()-1;i>=0;i--){
		        if(s.charAt(i)=='1'){
		            idx2=i;
		            break;
		        }
		    }
		    if(idx1==-1) System.out.println("0");
		    else{
		        int count=0;
		        for(int i=idx1;i<=idx2;i++){
		            if(s.charAt(i)=='0') count++;
		        }
		        System.out.println(count);
		    }
		}
		
		

	}
}
