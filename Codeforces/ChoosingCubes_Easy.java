// https://codeforces.com/problemset/problem/1980/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int f=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int val=arr[f-1];
            boolean isTrue1=false;
            boolean isTrue2=false;
            Arrays.sort(arr);
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;
            }
            for(int i=0;i<k;i++){
                if(arr[i]==val){
                    isTrue1=true;
                    break;
                }
            }
            for(int i=k;i<n;i++){
                if(arr[i]==val){
                    isTrue2=true;
                    break;
                }
            }
            
            if(isTrue1 && isTrue2) System.out.println("MAYBE");
            else if(isTrue1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
