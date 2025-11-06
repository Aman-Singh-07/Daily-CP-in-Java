// https://www.codechef.com/problems/CHRBUY?tab=statement

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
		    int w=input.nextInt();
		    int p=input.nextInt();
		    int k=input.nextInt();
		    if(k<=w) System.out.println(k*2);
		    else{
		        System.out.println(w*2+(k-w));
		    }
		}

	}
}
