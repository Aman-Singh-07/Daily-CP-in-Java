// https://www.codechef.com/problems/MAKESUB?tab=statement

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
		    char[] ch=s.toCharArray();
		    int left=0;
		    int right=ch.length-1;
		    int count1=0;
		    for(char c:ch){
		        if(c=='1') count1++;
		    }
		    if(count1<2){
		        System.out.println(0);
		    }
		    else{
		    while(left<right){
		        if(ch[left]=='1' && ch[right]=='1') break;
		        else if(ch[left]=='0'){
		            ch[left]='7';
		            left++;
		        }
		        else{
		            ch[right]='7';
		            right--;
		        }
		    }
		    int count=0;
		    for(char c:ch){
		        if(c=='0') count++;
		    }
		    System.out.println(count);
		    }
		}

	}
}
