// https://www.codechef.com/problems/VACCINE2

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
		    int d=input.nextInt();
		    ArrayList<Integer> atRisk=new ArrayList<>();
		    ArrayList<Integer> noRisk=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x>=80 || x<=9) atRisk.add(x);
		        else noRisk.add(x);
		    }
		    System.out.println((atRisk.size()%d==0?atRisk.size()/d:(atRisk.size()/d)+1)+(noRisk.size()%d==0?noRisk.size()/d:(noRisk.size()/d)+1));
		}

	}
}
