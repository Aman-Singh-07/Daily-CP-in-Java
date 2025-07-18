// https://www.codechef.com/problems/CLIPLX
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
		    if(x<=y){
		        System.out.println(0);
		    }
		    else{
		        int count=0;
		        while(x>y){
		            x-=2;
		            y--;
		            count++;
		        }
		        System.out.println(count);
		    }
		}

	}
}
