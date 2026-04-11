// https://www.codechef.com/problems/CHEFDETE?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++){
		    int x=input.nextInt();
		    set.add(x);
		}
		for(int i=1;i<=n;i++){
		    if(!set.contains(i)){
		        System.out.print(i+" ");
		        
		    }
		}
		

	}
}
