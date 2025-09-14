// https://www.codechef.com/problems/PASSINGGR
 
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
		    int num=input.nextInt();
		    int count=1;
		    for(int i=1;i<n;i++){
		        int x=input.nextInt();
		        if(x>=num) count++;
		    }
		    System.out.println(count);
		    
		}

	}
}
