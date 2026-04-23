// https://codeforces.com/problemset/problem/1992/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		    int a=input.nextInt();
		    minHeap.add(a);
		    int b=input.nextInt();
		    minHeap.add(b);
		    int c=input.nextInt();
		    minHeap.add(c);
		    int i=5;
		    while(i>0){
		        minHeap.add(minHeap.poll()+1);
		        i--;
		    }
		    long mux=1;
		    while(!minHeap.isEmpty()){
		        mux*=minHeap.poll();
		    }
		    System.out.println(mux);
		}

	}
}
