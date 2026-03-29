// https://www.codechef.com/problems/CREP

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
		    int k=input.nextInt();
		    HashMap<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        map.put(x,map.getOrDefault(x,0)+1);
		    }
		    long sum=0;
		    boolean isTrue=false;
		    for (Map.Entry<Integer, Integer> entry:map.entrySet()){
                if(entry.getValue()==k){
                    isTrue=true;
                    sum+=entry.getKey();
                }
            }
		    System.out.println(!isTrue?-1:sum);
		}

	}
}
