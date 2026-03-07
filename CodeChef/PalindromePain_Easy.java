// https://www.codechef.com/problems/PALINPAIN

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
		    if(x%2!=0 && y%2!=0) System.out.println("-1");
		    else{
		        if(x%2==0 && y%2==0){
		            StringBuilder sb1=new StringBuilder();
		            StringBuilder sb2=new StringBuilder();
		            for(int i=0;i<x/2;i++){
		                sb1.append('a');
		            }
		            for(int i=0;i<y/2;i++){
		                sb2.append('b');
		            }
		            System.out.println(sb1.toString()+sb2.toString()+sb2.toString()+sb1.toString());
		            System.out.println(sb2.toString()+sb1.toString()+sb1.toString()+sb2.toString());
		        }else if(x%2==0 && y%2!=0 && y>1){
		            StringBuilder sb1=new StringBuilder();
		            StringBuilder sb2=new StringBuilder();
		            for(int i=0;i<x/2;i++){
		                sb1.append('a');
		            }
		            for(int i=0;i<y/2;i++){
		                sb2.append('b');
		            }
		            System.out.println(sb1.toString()+sb2.toString()+"b"+sb2.toString()+sb1.toString());
		            System.out.println(sb2.toString()+sb1.toString()+"b"+sb1.toString()+sb2.toString());
		            
		        }else if(x%2!=0 && y%2==0 && x>1){
		            StringBuilder sb1=new StringBuilder();
		            StringBuilder sb2=new StringBuilder();
		            for(int i=0;i<x/2;i++){
		                sb1.append('a');
		            }
		            for(int i=0;i<y/2;i++){
		                sb2.append('b');
		            }
		            System.out.println(sb2.toString()+sb1.toString()+"a"+sb1.toString()+sb2.toString());
		            System.out.println(sb1.toString()+sb2.toString()+"a"+sb2.toString()+sb1.toString());
		        }else{
		            System.out.println(-1);
		        }
		    }
		}

	}
}
