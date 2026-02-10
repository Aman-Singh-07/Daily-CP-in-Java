// https://codeforces.com/problemset/problem/139/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=input.nextInt();
        }
        int res=0;
        while(n>0){
            n-=arr[res];
            if(n<=0) break;
            res++;
            if(res==7) res=0;
        }
        System.out.println(res+1);
    }
}
