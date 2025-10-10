// https://codeforces.com/contest/2143/problem/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int posn=-1;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]==n){
                    posn=i;
                }
            }
            boolean isTrue=true;
            for(int i=1;i<=posn;i++){
                if(arr[i]<arr[i-1]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                for(int i=posn+1;i<n;i++){
                    if(arr[i]>arr[i-1]){
                        isTrue=false;
                        break;
                    }
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
