// https://www.codechef.com/problems/NTRIPLETS

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
		    long n=input.nextLong();
		    ArrayList<Long> list=new ArrayList<>();
		    for(long i=1;i*i<=n;i++){
		        if(n%i==0){
		            list.add(i);
		            if(n/i!=i) list.add(n/i);
		        }
		    }
		    Collections.sort(list);
		    if(list.size()<4) System.out.println(-1);
		    else{
		        System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(list.size()-2));
		        
		    }
		}

	}
}
