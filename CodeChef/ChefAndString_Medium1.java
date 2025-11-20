// https://www.codechef.com/problems/WENOTI?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input=new Scanner(System.in);
        int t=1;
        t=input.nextInt();
        while(t-->0){
            long n=input.nextInt();
            long k=input.nextInt();
            String s=input.next();
            char[] ch=s.toCharArray();
            for(int i=1;i<n;i++){
                if(ch[i]=='I' && ch[i-1]!='I'){
                    ch[i]=ch[i-1];
                }
            }
            for(int i=(int)n-2;i>=0;i--)
            {
                if(ch[i]=='I' && ch[i+1]!='I')
                {
                    ch[i]=ch[i+1];
                }
            }
            long res=0;
            for(int i=0;i<n-1;i++){
                if(ch[i]==ch[i+1]){
                    res++;
                }
            }
            if(k>1 && ch[0]==ch[(int)n-1]){
                System.out.println(res*k+(k-1));
            }
            else if(k==1){
                System.out.println(res);
            }
            else {
                System.out.println(res*k);
            }
            
        }
	}
}
