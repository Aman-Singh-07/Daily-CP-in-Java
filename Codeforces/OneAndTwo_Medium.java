// https://codeforces.com/problemset/problem/1788/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=-1;
            int count2=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]==2) count2++;
            }
            if(count2%2!=0){
                System.out.println(-1);
            }
            else{
                int count=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==2){
                        count++;
                    }
                    if(count==(count2/2)){
                        k=i+1;
                        break;
                    }
                }
                System.out.println(k);
            }
        }
    }
}
