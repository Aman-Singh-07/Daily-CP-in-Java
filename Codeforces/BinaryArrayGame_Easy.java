// https://codeforces.com/problemset/problem/2183/A

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
            if(arr[0]==1 || arr[n-1]==1) System.out.println("Alice");
            else System.out.println("Bob");
            
        }
    }
}
