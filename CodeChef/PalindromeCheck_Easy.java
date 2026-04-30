// https://www.codechef.com/problems/PALKINS?tab=statement

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
		    int k=input.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		    }
		    int i=0;
		    int j=n-1;
		    boolean isTrue=true;
		    while(i<j){
		        if(arr[i]!=arr[j]){
		            if(arr[i]==k){
		               i++;
		            }else if(arr[j]==k){
		                j--;
		            }
		            else{
		                isTrue=false;
		                break;
		            }
		        }
		        else{
		            i++;
		            j--;
		        }
		    }
		    System.out.println(isTrue?"Yes":"No");
		}

	}
}
