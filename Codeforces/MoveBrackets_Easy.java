// https://codeforces.com/problemset/problem/1374/C

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            while(s.contains("()")){
                s=s.replace("()","");
            }
            int count=0;
            while(s.contains(")(")){
                s=s.replace(")(","");
                count++;
            }
            System.out.println(count);
        }
    }
}
