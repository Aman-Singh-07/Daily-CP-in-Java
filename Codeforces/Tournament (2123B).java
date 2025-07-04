// https://codeforces.com/problemset/problem/2123/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int j=input.nextInt();
            int k=input.nextInt();
            int max=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]>max) max=arr[i];
            }
            int target=arr[j-1];
            if(k>1 || target==max){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
