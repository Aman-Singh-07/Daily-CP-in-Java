// https://codeforces.com/problemset/problem/556/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        int count1=0;
        int count0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count1++;
            else count0++;
        }
        System.out.println(Math.abs(count1 - count0));
            
    }
}
