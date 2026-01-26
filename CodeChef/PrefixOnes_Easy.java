// https://www.codechef.com/problems/PREFONES?tab=statement

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
		    long count=0;
		    int j=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    j=i;
                    break;
                }
            }
            int max=0;
            for(int i=j;i<n;i++){
                int l=0;
                while(i<n && s.charAt(i)=='1'){
                    l++;
                    i++;
                }
                max=Math.max(max,l);
            }
            System.out.println(j+max);
		}

	}
}
