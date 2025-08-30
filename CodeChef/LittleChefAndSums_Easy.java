// https://www.codechef.com/problems/CHEFSUM?tab=ide

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
		    int minVal=Integer.MAX_VALUE;
            int minIdx=0; 
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                if(x<minVal){
                    minVal=x;
                    minIdx=i;
                }
            }
            System.out.println(minIdx + 1);
        }

	}
	
}
