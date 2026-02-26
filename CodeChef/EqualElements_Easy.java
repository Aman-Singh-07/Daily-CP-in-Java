// https://www.codechef.com/problems/EQELE

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
		    int count=0;
		    HashSet<Integer> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(set.contains(x)){
		            count+=2;
		            set.clear();
		        }
		        else set.add(x);
		    }
		    System.out.println(count);
		}

	}
}
