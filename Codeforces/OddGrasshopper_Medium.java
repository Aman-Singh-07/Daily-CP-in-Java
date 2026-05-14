// https://codeforces.com/problemset/problem/1607/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    long x=input.nextLong();
            long n=input.nextLong();
            long displacement=0;
            long remainder=n%4;
            if(remainder==0){
                displacement=0;
            } else if(remainder==1){
                displacement=-n;
            } else if(remainder==2){
                displacement=1;
            } else if(remainder==3){
                displacement=n+1;
            }
            if(x%2==0){
                System.out.println(x+displacement);
            }else{
                System.out.println(x-displacement);
            }
		}

	}
}
