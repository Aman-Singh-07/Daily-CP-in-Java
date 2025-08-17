// https://codeforces.com/problemset/problem/265/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String c=input.next();
        int count=0;
        for(int i=0;i<c.length();i++){
            if(count<s.length() && s.charAt(count)==c.charAt(i)){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
