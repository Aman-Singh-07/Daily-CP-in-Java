// https://codeforces.com/problemset/problem/313/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int t=input.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int count=0;
		for(int i=0;i<s.length()-1;i++){
		    if(s.charAt(i)==s.charAt(i+1)) count++;
		    list.add(count);
		}
		for(int i=0;i<t;i++){
		    int l=input.nextInt();
		    int r=input.nextInt();
		    l--;
		    r--;
		    if(l==0) System.out.println(list.get(r-1));
		    else{
		        System.out.println(list.get(r-1)-list.get(l-1));
		    }
		}

	}
}
