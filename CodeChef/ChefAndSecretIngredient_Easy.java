// https://www.codechef.com/problems/PCJ18A

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
		    int x=input.nextInt();
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        int y=input.nextInt();
		        if(y>=x){
		           isTrue=true;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
