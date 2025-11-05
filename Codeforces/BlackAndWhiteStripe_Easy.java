// https://codeforces.com/problemset/problem/1690/D

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            String s=input.next();
            int count=0;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W') count++;
            }
            int min=count;
            for(int i=k;i<n;i++){
                if(s.charAt(i-k)=='W') count--;
                if(s.charAt(i)=='W') count++;
                min=Math.min(min,count);
            }
            System.out.println(min);
        }
    }
}
