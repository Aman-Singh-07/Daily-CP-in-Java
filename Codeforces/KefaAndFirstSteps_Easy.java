// https://codeforces.com/problemset/problem/580/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int count=1;
        int max=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
                max=Math.max(max,count);
            }else{
                max=Math.max(count,max);
                count=1;
            }
        }
        max=Math.max(count,max);
        System.out.println(max);
    }
}
