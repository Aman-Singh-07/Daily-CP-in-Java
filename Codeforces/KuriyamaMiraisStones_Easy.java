// https://codeforces.com/problemset/problem/433/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i] = input.nextInt();
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr2);
        
        long[] prefix1 = new long[n+1];
        long[] prefix2 = new long[n+1];
        
        for(int i=0;i<n;i++){
            prefix1[i+1] = prefix1[i] + arr1[i];
            prefix2[i+1] = prefix2[i] + arr2[i];
        }
        
        int m = input.nextInt();
        while(m-- > 0){
            int type = input.nextInt();
            int l = input.nextInt();
            int r = input.nextInt();
            
            if(type == 1){
                System.out.println(prefix1[r] - prefix1[l-1]);
            } else {
                System.out.println(prefix2[r] - prefix2[l-1]);
            }
        }
    }
}
