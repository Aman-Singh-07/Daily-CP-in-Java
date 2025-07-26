// https://codeforces.com/problemset/problem/1878/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long k=input.nextLong();
            long x=input.nextLong();
            long minSum=k*(k+1)/2;
            long maxSum=k*(2*n-k+1)/2;
            if(maxSum>=x && x>=minSum) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
