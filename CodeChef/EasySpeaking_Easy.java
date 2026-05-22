// https://www.codechef.com/problems/EZSPK

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
		    String s=input.next();
		    if(n<=3) System.out.println("No");
		    else{
		        boolean isTrue=false;
		        for(int i=0;i<=n-4;i++){
		            if(!s.substring(i,i+4).contains("a") && !s.substring(i,i+4).contains("e")  && !s.substring(i,i+4).contains("i") && !s.substring(i,i+4).contains("o") && !s.substring(i,i+4).contains("u")){
		                isTrue=true;
		                break;
		            }
		        }
		        System.out.println(isTrue?"Yes":"No");
		    }
		}

	}
}
