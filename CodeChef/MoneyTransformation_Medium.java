// https://www.codechef.com/problems/MONTRANS

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner input= new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            long max=(a*100)+b;
            long res=0;
            long count=0;
            while(a>=0 && count<=10000){
                count++;
                if((a==0 && b<=c) || count>=10000){
                    break;
                }else if(b<c){
                    a-=1;
                    b+=100;
                }
                b-=c;
                long temp=a;
                a=b;
                b=temp;
                long m=(a*100)+b;
                if(m>max){
                    max=m;
                    res=count;
                }
            }
            
            System.out.println(res);
        }
    }
}

