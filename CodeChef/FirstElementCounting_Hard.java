// https://www.codechef.com/START210C/problems/FIRSTCNT

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
		    long[] arr=new long[n];
		    long[] temp=new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextLong();
		        temp[i]=arr[i];
		    }
		    Arrays.sort(arr);
		    HashMap<Long,Long> map=new HashMap<>();
		    for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    map.put(arr[i], -1L);
                } else {
                    long left = (arr[i - 1] + arr[i]) / 2 + 1;
                    long right = (arr[i] + arr[i + 1]) / 2;
                    long count = right - left + 1;
                    map.put(arr[i], count);
                }
            }
		    
		    for(int i=0;i<n;i++){
		        System.out.print(map.get(temp[i])+" ");
		    }
		    System.out.println();
		}

	}
}
	

