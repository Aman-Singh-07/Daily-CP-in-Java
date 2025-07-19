// https://codeforces.com/problemset/problem/1676/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            int firstSum=Integer.valueOf(s.charAt(0))+Integer.valueOf(s.charAt(1))+Integer.valueOf(s.charAt(2));
            int lastSum=Integer.valueOf(s.charAt(3))+Integer.valueOf(s.charAt(4))+Integer.valueOf(s.charAt(5));
            if(firstSum==lastSum){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
