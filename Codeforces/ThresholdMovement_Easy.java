// https://codeforces.com/contest/2250/problem/A

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            if(n%2!=0){
                System.out.println("NO");
                continue;
            }
            long minodd=Long.MAX_VALUE;
            
            long maxeven=Long.MIN_VALUE;
            
            for(int i=0;i<n;i+=2){
                minodd=Math.min(minodd,arr[i]);
            }
            for(int i=1;i<n;i+=2){
                maxeven=Math.max(maxeven,arr[i]);
            }
            
            if(minodd-maxeven>=2){
                System.out.println("YES");
                continue;
            }
            
            System.out.println("NO");
        }
    }
}
