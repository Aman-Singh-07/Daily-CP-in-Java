// https://www.codechef.com/problems/CNDY

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
		    HashSet<Integer> s=new HashSet<>();
		    int[] arr=new int[2*n];
		    for(int i=0;i<2*n;i++){
		        arr[i]=input.nextInt();
		        s.add(arr[i]);
		    }
		    boolean isTrue=true;
		    for(int j:s){
		        int count=0;
		        for(int i=0;i<2*n;i++){
		            if(arr[i]==j){
		                count++;
		            }
		            if(count>2){
		                isTrue=false;
		                break;
		            }
		        }
		    }
		    System.out.println(isTrue?"Yes":"No");
		}

	}
}
