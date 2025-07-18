// https://www.codechef.com/problems/TABLET

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
		    int b=input.nextInt();
		    int max=0;
		    for(int i=0;i<n;i++){
		        int w=input.nextInt();
		        int h=input.nextInt();
		        int p=input.nextInt();
		        if(p<=b && (w*h)>max) max=w*h;
		    }
		    System.out.println(max==0?"no tablet":max);
		}

	}
}
