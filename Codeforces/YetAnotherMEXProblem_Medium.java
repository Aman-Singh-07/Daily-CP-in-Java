// https://codeforces.com/problemset/problem/2183/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==count){
                    count++;
                }
                if(arr[i]>count) break;
            }
            System.out.println(Math.min(count,k-1));
            
        }
    }
}
