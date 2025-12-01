// https://www.codechef.com/problems/GIT01?tab=statement

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
		    int k=input.nextInt();
		    int countRed1=0;
		    int countGreen1=0;
		    int countGreen2=0;
		    int countRed2=0;
		    for(int i=0;i<n;i++){
		        String s=input.next();
		        for(int j=0;j<k;j++){
		            if(s.charAt(j)=='R'){
		                if((i+j)%2==0) countRed1++;
		                else countRed2++;
		            }
		            else{
		                if((i+j)%2==0) countGreen1++;
		                else countGreen2++;
		            }
		        }
		    }
		    System.out.println(Math.min(countRed1*5+countGreen2*3,countGreen1*3+countRed2*5));
		}
	}
}
