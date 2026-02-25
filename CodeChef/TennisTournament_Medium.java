// https://www.codechef.com/problems/EXUNB

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
		    int x=n*(n-1)/2;
		    if(x%n!=0) System.out.println("NO");
		    else{
		        System.out.println("YES");
		        int winsNeeded=(n-1)/2;
                for(int i=0;i<n;i++){
                    StringBuilder row=new StringBuilder();
                    for(int j=0;j<n;j++){
                        if(i==j) {
                            row.append('0');
                        }else{
                            int diff=(j-i+n)%n;
                            if(diff>0 && diff<=winsNeeded){
                                row.append('1');
                            }else{
                                row.append('0');
                            }
                        }
                    }
                    System.out.println(row.toString());
                }
		    }
		    
		}
	}
}
