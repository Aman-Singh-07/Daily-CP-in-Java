// https://www.codechef.com/problems/CHOCUT

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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    int total=a*b;
            int maxKeep=0;
            if(c==0){
                maxKeep=total;
            } else if(c>total){
                maxKeep=0;
            } else{
                for(int i=1;i<b;i++){
                    int piece1=a*i;
                    int piece2=a*(b-i);
                    if (piece1>=c) maxKeep=Math.max(maxKeep,piece2);
                    if (piece2>=c) maxKeep=Math.max(maxKeep,piece1);
                }
                for(int i=1;i<a;i++){
                    int piece1=b*i;
                    int piece2=b*(a-i);
                    if (piece1>=c) maxKeep=Math.max(maxKeep,piece2);
                    if (piece2>=c) maxKeep=Math.max(maxKeep,piece1);
                }
            }
            System.out.println(maxKeep);
		}

	}
}
