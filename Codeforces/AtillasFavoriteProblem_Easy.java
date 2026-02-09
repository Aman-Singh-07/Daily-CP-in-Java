// https://codeforces.com/problemset/problem/1760/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int max=0;
            for(char ch:s.toCharArray()){
                max=Math.max(ch-'a',max);
            }
            System.out.println(max+1);
        }
    }
}
