// https://codeforces.com/problemset/problem/1399/A

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
            Arrays.sort(arr);
            boolean isTrue=true;
            for(int i=1;i<n;i++){
                if(Math.abs(arr[i]-arr[i-1])>=2){
                    isTrue=false;
                    break;
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
