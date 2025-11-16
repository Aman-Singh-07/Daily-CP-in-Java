// https://www.codechef.com/problems/PMA?tab=statement

import java.util.*;

public class Main {
	public static void main (String[] args)
	{
		// your code goes here
        Scanner input=new Scanner(System.in);
        int  t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int  arr[]=new int[n];
            long sum=0;
            int min=1000000000,max=-1;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                arr[i]=Math.abs(arr[i]);
                if(i%2==0){
                    sum+=arr[i];
                    min=Math.min(min,arr[i]);
                }
                else{
                    sum-=arr[i];
                    max=Math.max(max,arr[i]);
                } 
            }
            if(min<max){
                sum-=(min*2);
                sum+=(max*2);
            }
            System.out.println(sum);
        }
	}
}
