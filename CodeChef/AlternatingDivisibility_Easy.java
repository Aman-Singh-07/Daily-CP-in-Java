// https://www.codechef.com/problems/ALTERNATEDIV?tab=statement

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
		    ArrayList<Integer> list=new ArrayList<>(); 
		    for(int i=1;i<=n;i++){ 
		        if(i%2==0){ 
		            list.add(list.get(list.size()-1)*2); 
		        }else list.add(i);
		        
		    }  
		    for(int num:list) System.out.print(num + " ");
		    System.out.println();
		}
	}
}
