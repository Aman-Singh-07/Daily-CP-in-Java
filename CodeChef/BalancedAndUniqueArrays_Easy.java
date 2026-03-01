// https://www.codechef.com/problems/UNQEQ

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
		    long sum1=0;
		    long sum2=0;
		    int i=1;
		    int j=n;
		    ArrayList<Integer> list1=new ArrayList<>();
		    ArrayList<Integer> list2=new ArrayList<>();
		    while(i<j){
		        if(i%2==0){
		            sum1+=i+j;
		            list1.add(i);
		            list1.add(j);
		            i++;
		            j--;
		        }else{
		            sum2+=i+j;
		            list2.add(i);
		            list2.add(j);
		            i++;
		            j--;
		        }
		    }
		    Collections.sort(list1);
		    Collections.sort(list2);
		    if(sum1!=sum2) System.out.println("NO");
		    else{
		        System.out.println("YES");
		        for(int num:list1) System.out.print(num+" ");
		        System.out.println();
		        for(int num:list2) System.out.print(num+" ");
		        System.out.println();
		    }
		}

	}
}
