// https://www.codechef.com/problems/ALTTAB

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
		LinkedHashSet<String> set=new LinkedHashSet<>(); 
		while(n-->0){
		    String s=input.next(); 
		    if(set.contains(s)){ 
		        set.remove(s); 
		    } 
		    set.add(s);
		} 
		List<String> list=new ArrayList<>(set);
		StringBuilder sb=new StringBuilder(); 
		for(int i=list.size()-1;i>=0;i--){ 
		    String st=list.get(i); 
		    sb.append(st.substring(st.length()-2)); 
		} 
		System.out.println(sb.toString()); 
	    
	} 
}
