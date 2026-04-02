// https://www.codechef.com/problems/FOODRES?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] arr=new int[n];
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            set.add(x);
            if(x>max) max=x;
            arr[i]=x;
        }
        int left=1;
        int right=max;
        int res=0;
        int y=set.size();
        res=getRes(left,right,n,arr,m,res);

        System.out.println(res);

    }

    public static int getRes(int left,int right,int n,int[] arr,int m,int res){
        long r=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0){
                left=mid+1;
                continue;
            }
            long count=0;
            long temp=count;
            for(int i=0;i<n;i++){
                count+=(arr[i]/mid);
            }
            if(count>=m){
                res=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
            temp=count;
            r=temp;
        }
        return res;
    }
}
