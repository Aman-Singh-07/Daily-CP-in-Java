// https://codeforces.com/problemset/problem/1933/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n=input.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                sum+=Math.abs(x);
            }
            System.out.println(sum);
            
        }
        
    }
}
