//  https://codeforces.com/problemset/problem/2205/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long res=1;
            long temp=n;
            for(long i=2;i*i<=temp;i++){
                if(temp%i==0){
                    res*=i; 
                    while(temp%i==0){
                        temp/=i;
                        
                    }
                    
                }
            }
            if(temp>1) res*=temp;
            System.out.println(res);
        }
    }
}
