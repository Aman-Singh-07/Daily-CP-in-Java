// https://www.codechef.com/problems/CHFICRM

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
		    int[] arr={0,0,0};
		    boolean isTrue=true;
		    for(int i=0;i<n;i++){
		        int x=input.nextInt();
		        if(x==5) arr[0]++;
		        if(x==10) arr[1]++;
		        if(x==15) arr[2]++;
		        if(x!=5 && isTrue){
		            x-=5;
		            if(x==10){
		                if(arr[1]>0){
		                    arr[1]--;
		                }else if(arr[0]>1) arr[0]-=2;
		                else isTrue=false;
		            }
		            else if(x==5 && arr[0]>0) arr[0]--;
		            else isTrue=false;
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		}

	}
}
