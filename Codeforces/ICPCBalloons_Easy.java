// https://codeforces.com/problemset/problem/1703/B

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int count=0;
            HashSet<Character> set=new HashSet<>();
            for(char ch:s.toCharArray()){
                if(set.contains(ch)) count++;
                else{
                    set.add(ch);
                    count+=2;
                }
            }
            System.out.println(count);
        }
    }
}
