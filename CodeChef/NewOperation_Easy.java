// https://www.codechef.com/problems/NEWOP?tab=statement

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
		    ArrayList<Integer> l=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        list.add(x);
		        l.add(x);
		    }
		    int min=find(list.get(0));
		    long max=0;
		    for(int i=0;i<l.size();i++){
		        max+=(long)l.get(i)*(1<<i);
		    }
		    for(int i=1;i<list.size();i++) min+=2*list.get(i);
		    System.out.println(min+" "+max);
		   
		}

	}
	public static int find(int num){
	    int min=Integer.MAX_VALUE;
	    if(min>num) return num;
	    return num;
	}
}
