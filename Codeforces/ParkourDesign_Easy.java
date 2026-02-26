// https://codeforces.com/problemset/problem/2202/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long x=input.nextLong();
            long y=input.nextLong();
            long k=x-2*y;
            if(k>=0 && k%3==0){
                long needed_n3=Math.max(0,-y);
                if(6*needed_n3<=k){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
