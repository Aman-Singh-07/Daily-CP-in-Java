// https://www.codechef.com/problems/AVGARR?tab=statement

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
            int x=input.nextInt();
            int l=x-n/2;
            int r=x+n/2;
            if(n%2==0){
                for(int i=l;i<=r;i++){
                    if(i!=x){
                    System.out.print(i+" ");
                    }
                }
            }else{
                for(int i=l;i<=r;i++){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
	}
}
