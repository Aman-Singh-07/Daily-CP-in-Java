// https://www.codechef.com/problems/SAD

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		    int r=input.nextInt();
		    int c=input.nextInt();
		    int[][] arr=new int[r][c];
		    ArrayList<Integer> list2=new ArrayList<>();
		    for(int i=0;i<r;i++){
		        int min=Integer.MAX_VALUE;
		        for(int j=0;j<c;j++){
		            int x=input.nextInt();
		            arr[i][j]=x;
		            min=Math.min(min,x);
		        }
		        list2.add(min);
		    }
		    ArrayList<Integer> list1=new ArrayList<>();
		    for(int i=0;i<c;i++){
		        int max=Integer.MIN_VALUE;
		        for(int j=0;j<r;j++){
		            max=Math.max(arr[j][i],max);
		        }
		        list1.add(max);
		    }
		    int num=-1;
		    for(int num1:list1){
		        for(int num2:list2){
		            if(num1==num2) num=num1;
		        }
		    }
		    System.out.println(num==-1?"GUESS":num);
	}
}
