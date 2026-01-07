// https://www.codechef.com/problems/SPCP3

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int count1=0;
		    int count2=0;
		    int count3=0;
		    int x=a;
		    int y=b;
		    int temp1=a;
		    int temp2=b;
		    if(a<b){
		        while(a%b!=0){
		            a++;
		            b--;
		            count1++;
		        }
		        
		    }
		    else{
		        while(a%b!=0){
		            a--;
		            b++;
		            count2++;
		        }
		        while(x%y!=0){
		            x++;
		            y--;
		            count3++;
		        }
		    }
		    System.out.println((temp1<temp2)?count1:Math.min(count2,count3));
		}

	}
}
