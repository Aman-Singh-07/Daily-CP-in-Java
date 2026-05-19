// https://www.codechef.com/problems/KS2?tab=statement

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
		    String n=input.next(); 
            int sum=0;
            for(int i=0;i<n.length();i++){
                sum+=n.charAt(i)-'0'; 
            }
            if(sum%10==0){
                System.out.println(n+"0");
            }else{
                System.out.println(n+(10-(sum%10)));
            }
		}

	}
}
