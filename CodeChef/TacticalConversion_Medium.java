// https://www.codechef.com/problems/P4209?tab=statement

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
            int count0=0;
            int count1=0;
            for(char ch:s.toCharArray()){
                if(ch=='1') count1++;
                else count0++;
            }
            if(count1==2 &&  s.contains("11")) System.out.println("NO");
            else if(count1==3 && s.contains("111")) System.out.println("NO");
            else System.out.println("YES");
            
        }
    }
}
