//  https://www.codechef.com/problems/BORROWBOOK?tab=statement

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
		    int sum=0;
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    HashSet<Integer> set=new HashSet<>();
		    for(int i=n-1;i>=0;i--){
		        if(!set.contains(arr[i])){
		            sum+=i+1;
		            set.add(arr[i]);
		        }
		    }
		    System.out.println(sum);
		}
	}
}
