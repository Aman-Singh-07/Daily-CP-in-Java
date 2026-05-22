// https://codeforces.com/problemset/problem/2231/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int l=1;
		    int r=2;
		    if(n==1) System.out.println(1);
		    else if(n==2) System.out.println("1 2");
		    else{
		        int num=2*n;
		        for(int i=0;i<n;i++){
		            System.out.print(num+" ");
		            num--;
		        }
		        System.out.println();
		        
		    }
		}

	}
}
