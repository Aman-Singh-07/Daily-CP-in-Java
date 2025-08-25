// https://codeforces.com/problemset/problem/1896/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            boolean changed=true;
            while(changed){
                changed=false;
                for(int i=1;i<n-1;i++){
                    if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        changed=true;
                    }
                }
            }
            boolean isSorted=true;
            for(int i=1;i<n;i++) {
                if(arr[i-1]>arr[i]){
                    isSorted=false;
                    break;
                }
            }
            System.out.println(isSorted?"YES":"NO");
        }
    }
}
