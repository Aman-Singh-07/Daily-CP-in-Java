// https://codeforces.com/contest/2184/problem/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            if(k>n) System.out.println(-1);
            else{
                int high=n;
                int low=n;
                int count=0;
                boolean isTrue=false;
                while(low>=k){
                    if(high==k || low==k){
                        isTrue=true;
                        break;
                    }
                    high=high/2;
                    low=(low+1)/2;
                    count++;
                    if(low==0) break;
                }
                if(isTrue) System.out.println(count);
                else System.out.println(-1);
            }
        }
    }
}
