// https://www.codechef.com/problems/KNOCKOUT

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
		    int[] org=new int[16];
		    ArrayList<Integer> temp=new ArrayList<>();
		    for(int i=0;i<16;i++){
		        org[i]=input.nextInt();
		        temp.add(org[i]);
		    }
		    Collections.sort(temp);
		    for(int i=0;i<16;i++){
		        if(temp.indexOf(org[i])==15){
		            System.out.print(4+" ");
		        }
		        else if(temp.indexOf(org[i])>=7){
		            System.out.print(3+" ");
		        }
		        else if(temp.indexOf(org[i])>=3){
		            System.out.print(2+" ");
		        }
		        else if(temp.indexOf(org[i])>=1){
		            System.out.print(1+" ");
		        }
		        else System.out.println(0+" ");
		    }
		    System.out.println();
		}

	}
}
