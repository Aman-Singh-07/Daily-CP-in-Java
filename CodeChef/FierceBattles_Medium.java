// https://www.codechef.com/problems/DRGNBOOL

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
		    int m=input.nextInt();
		    ArrayList<int[]> list1=new ArrayList<>();
		    ArrayList<int[]> list2=new ArrayList<>();
		    for(int i=0;i<n;i++){
		        int[] arr=new int[2];
		        arr[0]=input.nextInt();
		        arr[1]=input.nextInt();
		        list1.add(arr);
		    }
		    for(int i=0;i<m;i++){
		        int[] arr=new int[2];
		        arr[0]=input.nextInt();
		        arr[1]=input.nextInt();
		        list2.add(arr);
		    }
		    
		    for(int[] l1:list1){
		        for(int[] l2:list2){
		            if(l1[0]>=l2[0] && l1[1]==l2[1]){
		                l1[0]=l1[0]-l2[0];
		                l2[0]=0;
		            }
		            else if(l2[0]>=l1[0] && l1[1]==l2[1]){
		                l2[0]=l2[0]-l1[0];
		                l1[0]=0;
		            }
		            
		        }
		    }
		    long sum=0;
		    for(int[] a:list2){
		        sum+=a[0];
		    }
		    System.out.println(sum);
		    
		}

	}
}
