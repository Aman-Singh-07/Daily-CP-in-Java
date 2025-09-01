// https://www.codechef.com/problems/CHEFCHR?tab=ide

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
		    String s=input.next();
		    int count=0;
		    String compArr="cefh";
		    char[] ch=compArr.toCharArray();
		    Arrays.sort(ch);
		    String comp=new String(ch);
		    for(int i=0;i<=s.length()-4;i++){
		        char[] temp=s.substring(i,i+4).toCharArray();
		        Arrays.sort(temp);
		        String st=new String(temp);
		        if(st.equals(comp)){
		            count++;
		        }
		        
		    }
		    if(count!=0){
		        System.out.println("lovely "+count);
		    }
		    else System.out.println("normal");
		}

	}
}
