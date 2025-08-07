// https://www.codechef.com/problems/MODEFREQ

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
		    int[] freq=new int[11];
		    for(int i=1;i<=n;i++){
		        int x=input.nextInt();
		        freq[x]++;
		    }
		    HashSet<Integer> set=new HashSet<>();
		    for(int num:freq){
		        if(num!=0)
		        set.add(num);
		    }
		    int max=0;
		    int num=0;
		    for(int num1:set){
		        int count=0;
		        for(int num2:freq){
		            if(num1==num2) count++;
		        }
		        if(count>max){
		            max=count;
		            num=num1;
		        }
		    }
		     for(int num1:set){
		        int count=0;
		        for(int num2:freq){
		            if(num1==num2) count++;
		        }
		        if(count==max && num1<num) num=num1;
		     }
		     System.out.println(num);
		}

	}
}
