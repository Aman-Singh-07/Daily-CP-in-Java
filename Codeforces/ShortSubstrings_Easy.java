// https://codeforces.com/problemset/problem/1367/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(0));
            for(int i=1;i<s.length();i+=2){
                sb.append(s.charAt(i));
            }
            System.out.println(sb.toString());
        }
    }
}
