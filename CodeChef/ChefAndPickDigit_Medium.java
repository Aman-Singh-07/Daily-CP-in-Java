// https://www.codechef.com/problems/CHEFPDIG?tab=statement

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
            String s=input.next();
            int[] track=new int[10];
            for(int i=0;i<s.length();i++) track[s.charAt(i)-'0']++;
            List<Character> set=new ArrayList<>();
            for(int i=65;i<=(90);i++){
                int u=i%10;
                int tens=i/10;
                if(u!=tens && track[u]>0 && track[tens]>0) set.add((char) i);
                else if(u==tens && track[u]>1) set.add((char) i);
            }
            
            Collections.sort(set);
            for(char x:set) System.out.print(x);
            System.out.println();
        }
	}
}
