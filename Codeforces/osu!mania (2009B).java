// https://codeforces.com/problemset/problem/2009/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=input.next();
            }
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<arr[i].length();j++){
                    if(arr[i].charAt(j)=='#'){
                        System.out.print((j+1)+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
