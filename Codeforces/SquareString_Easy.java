// https://codeforces.com/problemset/problem/1619/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            if(s.length()%2!=0) System.out.println("NO");
            else {
                if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2,s.length()))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
