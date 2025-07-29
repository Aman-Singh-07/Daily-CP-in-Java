// https://www.codechef.com/problems/TRUEDARE

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
		    int tr=input.nextInt();
		    ArrayList<Integer> rt=new ArrayList<>();
		    for(int i=0;i<tr;i++){
		        rt.add(input.nextInt());
		    }
		    ArrayList<Integer> rd=new ArrayList<>();
		    int dr=input.nextInt();
		    for(int i=0;i<dr;i++){
		        rd.add(input.nextInt());
		    }
		    boolean isTrueTruth=true;
		    int ts=input.nextInt();
		    for(int i=0;i<ts;i++){
		        int x=input.nextInt();
		        if(!rt.contains(x) && isTrueTruth){
		            isTrueTruth=false;
		        }
		    }
		    int ds=input.nextInt();
		    boolean isTrueDare=true;
		    for(int i=0;i<ds;i++){
		        int x=input.nextInt();
		        if(!rd.contains(x) && isTrueDare){
		            isTrueDare=false;
		        }
		    }
		    
		    System.out.println((isTrueDare && isTrueTruth)?"yes":"no");
		    
		}

	}
}
