// https://codeforces.com/problemset/problem/1927/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int left=-1;
            int right=-1;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='B'){
                    left=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='B'){
                    right=i;
                    break;
                }
            }
            System.out.println(right-left+1);
        }
    }
}
