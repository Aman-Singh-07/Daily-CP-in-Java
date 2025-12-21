// https://www.codechef.com/problems/STONES?tab=ide

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
		    String j=input.next();
		    String s=input.next();
		    int count=0;
		    HashSet<Character> set=new HashSet<>();
		    for(char ch:j.toCharArray()){
		        set.add(ch);
		    }
		    for(char ch:s.toCharArray()){
		        if(set.contains(ch)) count++;
		    }
		    System.out.println(count);
		}

	}
}
