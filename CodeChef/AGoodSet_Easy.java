// https://www.codechef.com/problems/GOODSET

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
		    ArrayList<Integer> list=new ArrayList<>();
		    for(int i=1,c=1;i<=500 && list.size()<n;c++){
		        if(!list.contains(c)){
		            list.add(i);
		            i+=2;
		        }
		    }
		    for(int num:list){
		        System.out.print(num+" ");
		    }
		    System.out.println();
		    
		    
		}

	}
}
