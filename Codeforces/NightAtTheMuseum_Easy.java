// https://codeforces.com/problemset/problem/731/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            String name=input.next();
            int totalRotations=0;
            char current='a';
            for(char ch:name.toCharArray()){
                int diff=Math.abs(ch-current);
                totalRotations+=Math.min(diff,26-diff);
                current=ch;
                
            }
            System.out.println(totalRotations);
        
    }
}
