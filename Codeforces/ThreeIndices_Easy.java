// https://codeforces.com/problemset/problem/1380/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Code
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
		    boolean isTrue=false;
		    int l=0;
		    int k=0;
		    int m=0;
		    for(int i=1;i<n-1;i++){
		        if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
		            l=i-1;
		            k=i;
		            m=i+1;
		            isTrue=true;
		            break;
		        }
		    }
        l++;
        m++;
        k++;
		    if(isTrue){
		        System.out.println("YES");
		        System.out.println(l+" "+k+" "+m);
		    }else System.out.println("NO");
		    
		}

	}
}
