// https://codeforces.com/problemset/problem/1097/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<5;i++){
            sb.append(input.next());
        }
        System.out.println(((sb.toString().contains(String.valueOf(s.charAt(0)))) || sb.toString().contains(String.valueOf(s.charAt(1)))) ?"YES":"NO");
    }
}
