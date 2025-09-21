// https://www.codechef.com/problems/INCGAME?tab=statement

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
		    int k=input.nextInt();
		    if(k>=x && k>=y) System.out.println("Alice");
		    else if(k>=x && k<=y){
		        if((y-k)<=k) System.out.println("Alice");
		        else System.out.println("Bob");
            }
            else if(k<=x && k>=y){
                if((x-k)<=k) System.out.println("Alice");
                else System.out.println("Bob");
            }else System.out.println("Bob");
		}

	}
}
