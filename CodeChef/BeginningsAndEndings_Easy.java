// https://www.codechef.com/problems/EQBEND
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
		    HashSet<Integer> set=new HashSet<>();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=input.nextInt();
		        set.add(arr[i]);
		    }
		    if(set.size()==n) System.out.println("-1");
		    else{
		        HashMap<Integer,int[]> map=new HashMap<>();
		        for(int i=0;i<n;i++){
		            if(map.containsKey(arr[i])){
		                int[] b=map.get(arr[i]);
		                b[1]=i;
		            }else{
		                int[] a=new int[2];
		                a[0]=i;
		                map.put(arr[i],a);
		            }
		        }
		        int min=Integer.MAX_VALUE;
		        for(int[] value:map.values()){
		            int a=value[0]-0;
		            int b=n-1-value[1];
		            min=Math.min(a+b,min);
		        }
		        System.out.println(min);
		    }
		}

	}
}
