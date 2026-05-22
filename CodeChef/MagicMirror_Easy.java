// https://www.codechef.com/problems/MIRRIM

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
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int x2=n/2;
		    int x1=(n/2)-1;
		    ArrayList<Integer> l1=new ArrayList<>();
		    ArrayList<Integer> l2=new ArrayList<>();
		    for(int i=1;i<=x1;i++) l1.add(arr[i]-arr[i-1]);
		    for(int i=n-1;i>x2;i--) l2.add(arr[i]-arr[i-1]);
		    boolean isTrue=true;
		    int sum=arr[0]+arr[n-1];
		    for(int i=0;i<n/2;i++){
                if (arr[i]+arr[n-1-i]!=sum){
                    isTrue=false;
                    break;
                }
            }
		    System.out.println(isTrue?"Yes":"No");
		}

	}
}
