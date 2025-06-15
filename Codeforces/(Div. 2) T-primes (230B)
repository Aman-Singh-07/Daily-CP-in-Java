// https://codeforces.com/problemset/problem/230/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextLong();
        }
        for(int i=0;i<n;i++){
            double sqrt=Math.sqrt(arr[i]);
            long num=(long)sqrt;
            if(num*num!=arr[i]){
                System.out.println("NO");
                continue;
            }
            if(num==1 || num==0){
                System.out.println("NO");
                continue;
            }
            if(num==2 || num==3){
                System.out.println("YES");
                continue;
            }
            if(num%2==0 || num%3==0){
                System.out.println("NO");
                continue;
            }
            boolean isTrue=true;
            for(long j=5;j*j<=num;j+=6){
                if(num%j==0 || num%(j+2)==0){
                    isTrue=false;
                    break;
                }
            }
            System.out.println(isTrue?"YES":"NO");
        }
 
    }
}
