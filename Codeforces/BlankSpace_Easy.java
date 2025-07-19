// https://codeforces.com/problemset/problem/1829/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int maxCount=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    count++;
                    maxCount=Math.max(maxCount,count);
                }
                else{
                    maxCount=Math.max(maxCount,count);
                    count=0;
                }
            }
            System.out.println(maxCount);
        }
    }
}
