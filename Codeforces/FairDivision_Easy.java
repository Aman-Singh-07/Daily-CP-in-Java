// https://codeforces.com/problemset/problem/1472/B

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
		    int n=input.nextInt();
		    int count1=0;
		    int count2=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x==1) count1++;
		        else count2+=2;
		    }
		    if(count1==0){
		        if((count2/2)%2==0) System.out.println("YES");
		        else System.out.println("NO");
		    }else{
		        if(count1%2==0 && count2%2==0) System.out.println("YES");
		        else System.out.println("NO");
		    }
		}

	}
}
