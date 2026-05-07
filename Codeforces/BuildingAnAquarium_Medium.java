// https://codeforces.com/contest/1873/problem/E

import java.util.*;

public class Code {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int x=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            long low=1;
            long high=(long) 2e9;
            long res=0;
            while(low<=high){
                long mid=low+(high-low)/2;
                long y=0;
                for(int i=0;i<n;i++){
                    if(arr[i]<mid){
                        y+=(mid-arr[i]);
                    }
                }
                if(y<=x){
                    res=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            System.out.println(res);
        }
    }
}
