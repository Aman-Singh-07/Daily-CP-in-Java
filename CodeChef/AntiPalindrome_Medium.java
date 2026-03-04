// https://www.codechef.com/problems/ANTIPALINDR?tab=ide

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
		    String s=input.next();
		    int[] freq=new int[26];
		    HashSet<Character> set=new HashSet<>();
		    for(char ch:s.toCharArray()){
		        set.add(ch);
		        freq[ch-'a']++;
		    }
		    if(set.size()==1){
		        if(n==1 && freq[s.charAt(0)]==1)System.out.println(0);
		        if(n%2==0) System.out.println(1);
		        else System.out.println(2);
		    }
		    else{
		        int count=0;
		        for(int num:freq){
		            if(num%2!=0) count++;
		        }
		        if(count<=1){
		            System.out.println(1);
		        }else{
		            System.out.println(0);
		        }
		    }
		}

	}
}
