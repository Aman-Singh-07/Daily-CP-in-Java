// https://www.codechef.com/problems/P5209

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
            int c01=0,c10=0;
            for(int i=1;i<n;i++){
                if(s.charAt(i-1)=='0' && s.charAt(i)=='1') c01++;
                if(s.charAt(i-1)=='1' && s.charAt(i)=='0') c10++;
            }
            if(c01==0 && c10==0){
                System.out.println("Bob");
            }else if(s.charAt(0)==s.charAt(n-1)){
                System.out.println("Alice");
            }else{
                if(c01==0 || c10==0){
                    System.out.println("Bob");
                }else{
                    System.out.println("Alice");
                }
            }
        }
	}
}

