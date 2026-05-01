// https://codeforces.com/problemset/problem/1669/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int x=input.nextInt();
		    int y=input.nextInt();
		    boolean is1=true;
		    boolean is2=true;
		    int mod1=x%2;
		    int mod2=y%2;
		    for(int i=2;i<n;i++){
		        int num=input.nextInt();
		        if(i%2==0){
		            if(num%2!=mod1) is1=false;
		        }else{
		            if(num%2!=mod2) is2=false;
		        }
		    }
		    if(is2 && is1) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
