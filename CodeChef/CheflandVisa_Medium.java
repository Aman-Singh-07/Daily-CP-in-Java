// https://www.codechef.com/problems/VISA

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
		    int x1=input.nextInt();
		    int x2=input.nextInt();
		    int y1=input.nextInt();
		    int y2=input.nextInt();
		    int z1=input.nextInt();
		    int z2=input.nextInt();
		    System.out.println((x2>=x1 && y2>=y1 && z1>=z2)?"YES":"NO");
		}

	}
}
