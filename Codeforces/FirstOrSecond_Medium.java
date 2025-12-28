//  https://codeforces.com/contest/2178/problem/C

import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            long sum=0;
            for(int i=1;i<n;i++) sum+=arr[i];
            long max=-sum;
            long temp=0;
            for (int i = 1; i < n; i++) {
                sum-=arr[i];
                long current=arr[0]+temp-sum;
                max=Math.max(max,current);
                temp+=Math.abs(arr[i]);
            }
            System.out.println(max);
        }
    }
}
