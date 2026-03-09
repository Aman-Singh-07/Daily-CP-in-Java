// https://www.codechef.com/problems/TEAMOF2

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
		    HashSet<HashSet<Integer>> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        int k=input.nextInt();
		        HashSet<Integer> s=new HashSet<>();
		        for(int j=0;j<k;j++){
		            int x=input.nextInt();
		            s.add(x);
		        }
		        set.add(s);
		    }
		    int count=0;
		    for(HashSet<Integer> s1:set){
		        for(HashSet<Integer> s2:set){
		            if(isFind(s1,s2)) count++;
		            if(count!=0) break;
		        }
		        if(count!=0) break;
		    }
		    System.out.println(count!=0?"YES":"NO");
		}

	}
	public static boolean isFind(HashSet<Integer> s1,HashSet<Integer> s2){
	    HashSet<Integer> set=new HashSet<>();
	    for(int num:s1) set.add(num);
	    for(int num:s2) set.add(num);
	    return set.size()==5;
	}
}
