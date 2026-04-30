// https://www.codechef.com/problems/UWUWU?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input. nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    String s=input.next();
		    int max=0;
		    int temp=0;
            int j=0;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if (j%2==0){
                    if(c=='u' || c=='o'){
                        j++;
                        max=Math.max(max,j);
                        temp=max;
                    } else {
                        j=0;
                    }
                }else{
                    if(c=='w'){
                        j++; 
                    }else if(c=='u' || c=='o'){
                        j=1;
                        max=Math.max(max,j);
                        temp=max;
                    } else {
                        j=0; 
                    }
                }
            }
            System.out.println(max);
		}

	}
}
