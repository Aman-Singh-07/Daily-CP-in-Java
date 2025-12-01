// https://codeforces.com/problemset/problem/492/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();   
        int l = input.nextInt();   
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        
        Arrays.sort(a);  
        
        double maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, a[i] - a[i - 1]);
        }
        
        double radius = maxGap / 2.0;
        
        radius = Math.max(radius, a[0] - 0);    
        radius = Math.max(radius, l - a[n - 1]); 
        
        System.out.printf("%.10f\n", radius); 
    }
}
