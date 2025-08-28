// https://codeforces.com/problemset/problem/1907/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            String n="12345678";
            for(int i=0;i<8;i++){
                if(n.charAt(i)!=(s.charAt(1))){
                    System.out.println(s.charAt(0)+""+n.charAt(i));
                }
            }
            String r="abcdefgh";
            for(char ch:r.toCharArray()){
                if(ch!=s.charAt(0)){
                    System.out.println(ch+""+s.charAt(1));
                }
            }
        }
    }
}
