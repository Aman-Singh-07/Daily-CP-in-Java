// https://codeforces.com/problemset/problem/1676/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int sum=0;
            int diff=arr[0];
            for(int i=1;i<n;i++){
                sum+=arr[i]-diff;
            }
            System.out.println(sum);
        }
    }
}
