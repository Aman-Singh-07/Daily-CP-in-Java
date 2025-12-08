// https://codeforces.com/problemset/problem/2175/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                set.add(arr[i]);
            }
            int size= set.size();
            int res=Integer.MAX_VALUE;
            for(int x:set){
                if(x>=size && x<res){
                    res=x;
                }
            }
            System.out.println(res);
        }
    }
}
