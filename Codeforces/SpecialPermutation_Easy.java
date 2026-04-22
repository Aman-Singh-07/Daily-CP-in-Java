// https://codeforces.com/problemset/problem/1454/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    System.out.print(n+" ");
		    for(int i=1;i<n;i++){
		        System.out.print(i+" ");
		    }
		    System.out.println();
		}
	}
}
