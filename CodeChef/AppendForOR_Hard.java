// https://www.codechef.com/problems/APPENDOR

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
		    int y=input.nextInt();
		    int num=0;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        num=num|x;
		    }
		    int res=-1;
		    for(int i=0;i<=y;i++){
		        if((num|i)==y){
		            res=i;
		            break;
		        }
		    }
		    System.out.println(res);
		    
		}

	}
}
