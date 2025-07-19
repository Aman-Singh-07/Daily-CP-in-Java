// https://codeforces.com/problemset/problem/474/A

import java.util.*;
import java.math.BigInteger;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        String s="qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder sb =new StringBuilder();
        if(s1.equals("R")){
            for(int i=0;i<s2.length();i++){
                sb.append(s.charAt(s.indexOf(s2.charAt(i))-1));
            }
        }
        else{
             for(int i=0;i<s2.length();i++){
                sb.append(s.charAt(s.indexOf(s2.charAt(i))+1));
            }
        }
        System.out.println(sb.toString());
        
    }
}
