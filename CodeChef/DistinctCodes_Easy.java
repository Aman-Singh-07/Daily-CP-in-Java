// https://www.codechef.com/problems/DISTCODE

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
		    String s=input.next();
		    HashSet<String> set=new HashSet<>();
		    int count=0;
		    for(int i=0;i<s.length()-1;i++){
		        if(!set.contains(s.substring(i,i+2))){
		            count++;
		            set.add(s.substring(i,i+2));
		        }
		    }
		    System.out.println(count);
		}

	}
}
