// https://www.codechef.com/problems/PRIME_XOR

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
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int z=x^y;
		    TreeSet<Integer> set=new TreeSet<>();
		    set.add(2);
		    if(x%2!=0) set.add(2^x);
		    if(y%2!=0) set.add(y^2);
		    if(z%2!=0) set.add(z^2);
		    int i=0;
		    for(int num:set){
		        if(i!=3){
		            System.out.print(num+" ");
		            i++;
		        }
		    }
		    System.out.println();
		}

	}
	
}
