// https://www.codechef.com/problems/RATIO2

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
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int count=0;
		    while(!(x>=(2*y) || y>=(2*x))){
		        if(x<=y) x--;
		        else y--;
		        count++;
		    }
		    System.out.println(count);
		}

	}
}
