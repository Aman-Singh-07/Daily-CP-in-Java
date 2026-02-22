// https://codeforces.com/problemset/problem/1325/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(input.nextInt());
            }
            System.out.println(set.size());
            
        }
    }
}
