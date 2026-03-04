// https://codeforces.com/problemset/problem/2164/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            boolean isTrue=false;
            for(int i=0;i<n;i++){
                for(int j=n-1;j>i;j--){
                    if((arr[j]%arr[i])%2==0){
                        System.out.println(arr[i]+" "+arr[j]);
                        isTrue=true;
                        break;
                    }
                }
                if(isTrue) break;
            }
            if(!isTrue) System.out.println(-1);
            
        }
    }
}
