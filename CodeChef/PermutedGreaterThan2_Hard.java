// https://www.codechef.com/START191D/problems/PERMGE2

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
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int z=input.nextInt();
		    int n=x+y+z;
		    int[] arr=new int[n];
		    int i=0;
		    while(z>0 && x>0){
		        arr[i++]=0;
		        arr[i++]=2;
		        z--;
		        x--;
		    }
		    while(z>0 && y>0){
		        arr[i++]=1;
		        arr[i++]=2;
		        z--;
		        y--;
		    }
		    while(z>0){
		        arr[i++]=2;
		        z--;
		    }
		    while(y>0){
		        arr[i++]=1;
		        y--;
		    }
		    while(x>0){
		        arr[i++]=0;
		        x--;
		    }
		    boolean valid=true;
            for(int j=0;j<n-1;j++) {
                if(arr[j]+arr[j+1]<2){
                    valid=false;
                    break;
                }
            }
            System.out.println(valid?"Yes":"No");
		}

	}
}
