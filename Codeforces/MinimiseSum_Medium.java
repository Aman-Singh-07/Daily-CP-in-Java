// https://codeforces.com/contest/2124/problem/B

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=input.nextLong();
            }
            if(arr[1]<arr[2]){
            System.out.println(2*arr[1]);
            }else{
            System.out.println(arr[1]+arr[2]);
            }
        }
        
    }
}
