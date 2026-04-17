// https://www.codechef.com/problems/SDSQUARE

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static ArrayList<Long> find(){
        ArrayList<Long> list=new ArrayList<>();
        for(long i=1;i<=100000L;i++){
            long square=i*i;
            if(perfect(square)){
                list.add(square);
            }
        }
        return list;
    }
    
    public static boolean perfect(long num){
        while(num>0){
            long rem=num%10;
            if(rem!=0 && rem!=1 && rem!=4 && rem!=9) return false;
            num/=10;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		ArrayList<Long> list=find();
		int t=input.nextInt();
		while(t-->0){
		    long a=input.nextLong();
		    long b=input.nextLong();
		    int count=0;
            for(long val:list){
                if(val>=a && val<=b){
                    count++;
                }
            }
                
            System.out.println(count);
		}

	}
}
