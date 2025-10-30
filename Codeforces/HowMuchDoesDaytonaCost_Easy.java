// https://codeforces.com/problemset/problem/1878/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            boolean isTrue=false;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(arr[i]==k) isTrue=true;
            }
            System.out.println(isTrue?"YES":"NO");
        }
        
    }
}
