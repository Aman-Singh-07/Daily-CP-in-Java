// https://www.codechef.com/problems/CONCATPAL

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            String s1 = input.next();
            String s2 = input.next();
            if (n < m) {
                String temp = s1;
                s1 = s2;
                s2 = temp;
            }
            int[] freq = new int[26];
            for(char ch : s1.toCharArray()) {
                freq[ch - 'a']++;
            }
            
            for(char ch : s2.toCharArray()) {
                freq[ch - 'a']--;
            }
            
            boolean isTrue = true;
            int oddCount = 0;
            for(int count : freq) {
                if (count < 0) {
                    isTrue = false;
                    break;
                }
                if (count % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount > 1) {
                isTrue = false;
            }
            
            System.out.println(isTrue ? "YES" : "NO");
        }
    }
}
