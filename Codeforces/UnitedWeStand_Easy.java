// https://codeforces.com/problemset/problem/1859/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int n=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    Arrays.sort(arr);
		    ArrayList<Integer> list=new ArrayList<>();
		    list.add(arr[0]);
		    for(int i=1;i<n;i++){
		        if(arr[i]==arr[i-1]){
		            list.add(arr[i]);
		        }else{
		            break;
		        }
		    }
		    if(list.size()==n){
		        System.out.println(-1);
		        continue;
		    }
		    
		    ArrayList<Integer> l=new ArrayList<>();
		    for(int i=list.size();i<n;i++){
		        l.add(arr[i]);
		    }
		    System.out.println(list.size()+" "+l.size());
		    for(int num:list) System.out.print(num+" ");
		    System.out.println();
		    for(int num:l) System.out.print(num+" ");
		    System.out.println();
		    
		    
		}

	}
}
