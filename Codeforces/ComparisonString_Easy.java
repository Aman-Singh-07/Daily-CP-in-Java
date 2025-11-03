// https://codeforces.com/problemset/problem/1837/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int count=1;
            int max=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    max=Math.max(count,max);
                    count=1;
                }
            }
            System.out.println(max+1);
            
        }
    }
}
