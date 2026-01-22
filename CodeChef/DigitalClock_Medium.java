// https://www.codechef.com/problems/ONOZ?tab=statement

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
		    int h=input.nextInt();
		    int m=input.nextInt();
		    int count=0;
            if(0<=h && 0<=m) count++;
            for(int i=1;i<=9;i++){
                int a=i, b=i*10+i;
                if(a<m && b<h) count++;
                if(a<m && a<h) count++;
                if(b<m && b<h) count++;
                if(b<m && a<h) count++;
            }
            System.out.println(count);
		    
		    
		}

	}
}
