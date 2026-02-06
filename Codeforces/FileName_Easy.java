// https://codeforces.com/problemset/problem/978/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        int count=0;
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='x' && s.charAt(i-1)=='x' && s.charAt(i+1)=='x') count++;
        }
        System.out.println(count);
    }
}
