// https://codeforces.com/contest/1883/problem/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int res=0;
            int left=0,right=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                right=(c=='0')?9:(c-'0'-1);
                res+=Math.abs(right-left)+1;
                left=right;
            }
            System.out.println(res);
        }
    }
}
