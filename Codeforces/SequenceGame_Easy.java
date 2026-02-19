// https://codeforces.com/problemset/problem/2164/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long x=input.nextLong();
                if(x<min) min=x;
                if(x>max) max=x;
            }
            long x=input.nextLong();
            System.out.println((min<=x && x<=max)?"YES":"NO");
        }
    }
}
