// https://codeforces.com/problemset/problem/1367/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int countEven=0;
            int countOdd=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]%2!=i%2){
                    if(i%2==0) countEven++;
                    else countOdd++;
                }
            }
            if(countEven==countOdd) System.out.println(countEven);
            else System.out.println(-1);
        }
    }
}
