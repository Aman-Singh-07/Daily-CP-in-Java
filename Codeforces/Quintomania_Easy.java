// https://codeforces.com/problemset/problem/2036/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            boolean isTrue=true;
            for(int i=1;i<n;i++){
                int abs=Math.abs(arr[i]-arr[i-1]);
                if(abs!=7 && abs!=5){
                    isTrue=false;
                    break;
                }
            }
            System.out.println(isTrue?"YES":"NO");

        }
    }
}
