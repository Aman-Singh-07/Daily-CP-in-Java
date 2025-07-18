// https://www.codechef.com/problems/P2P

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
		    String s1=input.next();
		    String s2=input.next();
		    char[] c1=s1.toCharArray();
		    char[] c2=s2.toCharArray();
		    int count=0;
		    boolean isTrue=false;
		    for(int i=0;i<n;i++){
		        if(c1[i]=='1' && c2[i]=='1') count++;
		        else if((c1[i]=='1' && c2[i]=='0')|| (c2[i]=='1' && c1[i]=='0')){
		            isTrue=true;
		        }
		    }
		    if((count%2==0 && isTrue) || count%2!=0) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
