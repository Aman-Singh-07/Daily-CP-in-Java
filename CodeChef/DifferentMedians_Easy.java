// https://www.codechef.com/problems/DIFFMED?tab=statement

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
		    for(int i=1;i<=n;i++){
		        list.add(i);
		    }
		    int left=0;
		    int right=n-1;
		    while(left<right){
		        System.out.print(list.get(right)+" ");
		        right--;
		        System.out.print(list.get(left)+" ");
		        left++;
		        if(left==right) System.out.print(list.get(left)+" ");
		    }
		    System.out.println();
		    
		}

	}
}
