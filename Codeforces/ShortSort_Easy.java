// https://codeforces.com/problemset/problem/1873/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            if(s.equals("abc")|| s.equals("bac")|| s.equals("cba")|| s.equals("acb")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
