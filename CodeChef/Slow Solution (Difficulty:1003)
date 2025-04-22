// https://www.codechef.com/problems/SLOWSOLN
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
		    int maxT=input.nextInt();
		    int maxN=input.nextInt();
		    int sumN=input.nextInt();
		    int count=Math.min(maxT,sumN/maxN);
		    int sumR=count*maxN*maxN;
		    int used=count*maxN;
            int rem=sumN-used;
            if(rem>0 && count<maxT){
                sumR+=rem*rem;
            }
            System.out.println(sumR);
		}

	}
}
