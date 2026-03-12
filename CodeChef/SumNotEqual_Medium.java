// https://www.codechef.com/problems/NOTSUM

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
		    ArrayList<Integer> l=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        list.add(x);
		        l.add(i);
		    }
		    Collections.sort(l,(i,j) -> Integer.compare(list.get(i),list.get(j)));
		    int a=l.get(0);
		    int b=l.get(1);
		    int c=l.get(n-1);
		    if(list.get(a)+list.get(b)!=list.get(c)) System.out.println((a+1)+" "+(b+1)+" "+(c+1));
		    else{
		        a=l.get(n-1);
		        b=l.get(n-2);
		        c=l.get(0);
		        if(list.get(a)+list.get(b)!=list.get(c)) System.out.println((a+1)+" "+(b+1)+" "+(c+1));
		        else{
		            a=l.get(0);
		            b=l.get(n/2);
		            c=l.get(n-1);
		            if(list.get(a)+list.get(c)!=list.get(b)) System.out.println((a+1)+" "+(c+1)+" "+(b+1));
		            else System.out.println("-1");
		        }
		    }
		}

	}
}
