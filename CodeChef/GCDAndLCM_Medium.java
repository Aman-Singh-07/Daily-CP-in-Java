// https://www.codechef.com/problems/GCDLM?tab=ide

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
		    if(x==y) System.out.println(x+y);
		    else if(x==1 || y==1) System.out.println(2);
		    else{
		        boolean isTrue=false;
		        while(k-->0){
		            int gcd=gcd(x,y);
		            if(x>y) x=gcd;
		            else y=gcd;
		            int lcm=(x/gcd)*y;
		            if(x>y) x=lcm;
		            else y=lcm;
		            
		            if(x==y){
		                System.out.println(x+y);
		                isTrue=true;
		                break;
		            }
		            if((x==1 || y==1) && k>0){
		                System.out.println(2);
		                isTrue=true;
		                break;
		            }
		        }
		        if(!isTrue) System.out.println(x+y);
		    }
		}

	}
	
	public static int gcd(int a,int b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}
