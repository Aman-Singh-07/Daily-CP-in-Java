// https://www.codechef.com/problems/TIDRICE?tab=ide

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
		    HashMap<String,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        String s1=input.next();
		        String s2=input.next();
		        int val=s2.equals("+")?1:-1;
		        map.put(s1,val);
		    }
		    
		    int sum=0;
		    for(int v:map.values()){
		        sum+=v;
		    }
		    System.out.println(sum);
		}

	}
}
