// https://www.codechef.com/problems/EVENTUAL

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
		    HashSet<Character> set=new HashSet<>();
		    for(int i=0;i<n;i++){
		        set.add(s.charAt(i));
		    }
		    boolean isTrue=true;
		    for(char c:set){
		        int count=0;
		        for(int i=0;i<n;i++){
		            if(c==s.charAt(i)) count++;
		        }
		        if(count%2!=0){
		            isTrue=false;
		            break;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
