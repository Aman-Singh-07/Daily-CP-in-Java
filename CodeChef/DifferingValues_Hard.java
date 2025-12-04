// https://www.codechef.com/START215C/problems/DIFFVAL

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
		    int k=input.nextInt();
		    String s=input.next();
		    int count0 = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0') count0++;
            }
            int bl=n/k; int extra=n%k; int normal=k-extra;
            int min=0; int max=0;
            int len1=bl+ 1;
            min+=(len1/2)*extra;
            max+=((len1+1)/2)*extra;
            int len2=bl;
            min+=(len2/2)*normal;
            max+=((len2+1)/2)*normal;
            System.out.println((count0>=min && count0<=max)?"Yes":"No");
        }
    }
}
