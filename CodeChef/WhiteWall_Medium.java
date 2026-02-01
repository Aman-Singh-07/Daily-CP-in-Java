// https://www.codechef.com/problems/WHITEWALL?tab=statement

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
		    int[] min=new int[6];
		    String[] st={"RGB", "GBR", "BRG", "BGR", "RBG", "GRB"};
		    for(int i=0;i<n;i++){
		        for(int j=0;j<6;j++){
		            if(s.charAt(i)!=st[j].charAt(i%3)) min[j]+=1;
		        }
		    }
		    int m=min[0];
		    for(int num:min){
		        m=Math.min(num,m);
		    }
		    System.out.println(m);
		}

	}
}
