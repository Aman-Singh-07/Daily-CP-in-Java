// https://www.codechef.com/problems/BESTMOVIE

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
		    ArrayList<Integer> list=new ArrayList<>();
		    while(n-->0){
		        int a=input.nextInt();
		        int b=input.nextInt();
		        if(a>=7){
		            list.add(b);
		        }
		    }
		    int minAmmount=0;
		    Collections.sort(list);
		    for(int i:list){
		        minAmmount=i;
		        break;
		    }
		    System.out.println(list.size()==0?-1:minAmmount);
		}

	}
}
