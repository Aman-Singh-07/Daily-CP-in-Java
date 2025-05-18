// https://codeforces.com/problemset/problem/339/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        int m=input.nextInt();
        long[] arr=new long[m];
        for (int i=0;i<m;i++){
            arr[i]=input.nextLong();
        }
        long sum=arr[0]-1;
        for(int i=0;i<m-1;i++){
            if(arr[i+1]>=arr[i]){
                sum+=arr[i+1]-arr[i];
            }
            else{
                sum+=n-arr[i]+arr[i+1];
            }
        }
        System.out.println(sum);
    }
}
