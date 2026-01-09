// https://www.codechef.com/problems/RECNDNOS
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
		    HashSet<Integer> set=new HashSet<>();
		    for(int i=0;i<arr.length;i++){
		        int x=input.nextInt();
		        arr[i]=x;
		        set.add(x);
		    }
		    int res=Integer.MAX_VALUE;
		    int max=0;
		    for(int num:set){
		        int count=0;
		        for(int i=0;i<arr.length;i++){
		            if(arr[i]==num){
		                i++;
		                
		                count++;
		            }
		        }
		        if(count>max){
		            max=count;
		            res=num;
		        }else if(count==max){
		            res=Math.min(res,num);
		        }
		    }
		    System.out.println(res);
		    
		}

	}
}
