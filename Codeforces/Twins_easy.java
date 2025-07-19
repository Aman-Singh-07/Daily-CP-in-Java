// https://codeforces.com/problemset/problem/160/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        long totalSum=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            totalSum+=arr[i];
        }
        Arrays.sort(arr);
        int count=0;
        int resSum=0;
        for(int i=n-1;i>=0;i--){
            resSum+=arr[i];
            count++;
            if(resSum>totalSum-resSum){
                break;
            }
            
        }
        System.out.println(count);
    }
}
