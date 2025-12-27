// https://codeforces.com/problemset/problem/1873/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            int[] arr=new int[n];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                min=Math.min(min,arr[i]);
            }
            for(int i=0;i<n;i++){
                if(arr[i]==min){
                    arr[i]++;
                    break;
                }
            }
            long product=1;
            for(int num:arr){
                product*=num;
            }
            System.out.println(product);
        }
    }
}
