// https://www.codechef.com/problems/LADDU

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
		    String origin=input.next();
		    input.nextLine();
		    ArrayList<String> list=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        list.add(input.nextLine());
		    }
		    
		    int sum=0;
		    for(String s:list){
		        String[] st=s.split(" ");
		        if(st[0].equals("CONTEST_WON")) sum+=300+Math.max(0, 20-Integer.parseInt(st[1]));
		        else if(st[0].equals("TOP_CONTRIBUTOR")) sum+=300;
		        else if(st[0].equals("BUG_FOUND")) sum+=Integer.parseInt(st[1]);
		        else if(st[0].equals("CONTEST_HOSTED")) sum+=50;
		        
		    }
		    
		    System.out.println(origin.equals("INDIAN")?sum/200:sum/400);
		}

	}
}
