// https://codeforces.com/problemset/problem/1791/C

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int count=0;
            int left=0;
            int right=n-1;
            while(left<right){
                if(s.charAt(left)=='1' && s.charAt(right)=='0' || s.charAt(left)=='0' && s.charAt(right)=='1'){
                    count+=2;
                    left++;
                    right--;
                }
                else break;
            }
            System.out.println(n-count);
        }
        
        
    }
}
