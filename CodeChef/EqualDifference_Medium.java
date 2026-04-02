// https://www.codechef.com/problems/EQSUM?tab=statement

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
		    Map<Integer,Long> map=new HashMap<>();
            long count=0;
		    int[] arr=new int[n];
            for(int i=0;i<n;i++){
                int val=input.nextInt();
                int num=val-(i+1);
                if (map.containsKey(num)){
                    count+=map.get(num);
                }
                map.put(num,map.getOrDefault(num,0L)+1);
            }
            System.out.println(count);
		}

	}
}
