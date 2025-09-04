// https://www.codechef.com/problems/NITIKA

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
		input.nextLine();
		while(t-->0){
		    String s=input.nextLine().trim();
		    String[] name=s.split(" ");
		    if(name.length==1){
		        System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase());
		    }
		    else if(name.length==2){
		        System.out.println(Character.toUpperCase(s.charAt(0))+". "+Character.toUpperCase(name[1].charAt(0))+name[1].substring(1).toLowerCase());
		    }
		    else{
		        System.out.println(Character.toUpperCase(s.charAt(0))+". "+Character.toUpperCase(name[1].charAt(0))+". "+Character.toUpperCase(name[2].charAt(0))+name[2].substring(1).toLowerCase());
		    }
		}

	}
}
