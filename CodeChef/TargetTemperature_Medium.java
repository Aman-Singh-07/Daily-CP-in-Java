// https://www.codechef.com/problems/RESETZ

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
		    int[] b=new int[n];
		    int max=0;
		    for(int i=0;i<n;i++){
		        b[i]=input.nextInt();
		        max=Math.max(max,b[i]);
		    }
		    HashSet<Integer> set=new HashSet<>();
		    boolean isTrue=true;
		    for(int num:b){
		        if(num!=max){
		            if(set.contains(num)){
		                isTrue=false;
		                break;
		            }
		            set.add(num);
		        }
		    }
		    System.out.println(isTrue?"Yes":"No");
		    
		}

	}
}
