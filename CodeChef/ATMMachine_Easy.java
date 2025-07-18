// https://www.codechef.com/problems/ATM2

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
		    int k=input.nextInt();
		    StringBuilder str=new StringBuilder();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x>k){
		            str.append(0);
		        }
		        else{
		            str.append(1);
		            k=k-x;
		        }
		    }
		    System.out.println(str.toString());
		}

	}
}
