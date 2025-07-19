// https://codeforces.com/problemset/problem/2044/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String S=input.next();
            StringBuilder sb=new StringBuilder();
            for(int i=S.length()-1;i>=0;i--){
                char ch=S.charAt(i);
                if(ch=='q') sb.append('p');
                else if(ch=='p') sb.append('q');
                else sb.append('w');
            }
            System.out.println(sb.toString());
              
        }
    }
}
