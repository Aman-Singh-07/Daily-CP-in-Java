// https://codeforces.com/problemset/problem/2188/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int left=1;
            int right=n;
            for(int i=n-1;i>=0;i--){
                if((n-1-i)%2==0){
                    arr[i]=left++;
                }else{
                    arr[i]=right--;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
