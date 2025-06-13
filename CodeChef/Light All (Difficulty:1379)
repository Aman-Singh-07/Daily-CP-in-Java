// https://www.codechef.com/problems/LTALL

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
		    char[] c=s.toCharArray();
		    for(int i=0;i<n-1;i++){
		        if((c[i]=='1' && c[i+1]=='0') || (c[i]=='0' && c[i+1]=='1')){
		            c[i]='7';
		            c[i+1]='7';
		        }
		    }
		    boolean isTrue=true;
		    for(char ch:c){
		        if(ch=='0'){
		            isTrue=false;
		            break;
		        }
		    }
		    System.out.println(isTrue?"Yes":"No");
		}

	}
}
