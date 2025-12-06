// https://www.codechef.com/problems/BINBASBASIC?tab=statement

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
		    int k=input.nextInt();
		    String s=input.next();
		    int left=0;
		    int count=0;
		    int right=s.length()-1;
		    while(left<=right){
		        if(s.charAt(left)!=s.charAt(right)) count++;
		        left++;
		        right--;
		    }
		    if(n%2==1){
		        if(count<=k) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                k-=count;
                if(k%2==0 && k>=0) System.out.println("YES");
                else System.out.println("NO");
            }
		}

	}
}
