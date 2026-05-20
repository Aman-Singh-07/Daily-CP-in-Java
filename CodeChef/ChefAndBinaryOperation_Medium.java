// https://www.codechef.com/problems/BINOP?tab=statement

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
		    String a=input.next();
		    String b=input.next();
		    int count10=0;
		    int count01=0;
		    boolean isZero=false;
		    boolean isOne=false;
		    for(int i=0;i<a.length();i++){
		        char cA=a.charAt(i);
		        char cB=b.charAt(i);
		        if(cA=='0') isZero=true;
		        else isOne=true;
		        if(cA=='0' && cB=='1') count01++;
		        else if(cA=='1' && cB=='0') count10++;
		        
		        
		    }
		    if((count01>0 && !isOne) || (count10>0 && !isZero)){
		        System.out.println("Unlucky Chef");
		    }else{
		        System.out.println("Lucky Chef");
		        System.out.println(Math.max(count01,count10));
		    }
		}

	}
}
