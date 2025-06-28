// https://codeforces.com/problemset/problem/1980/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            String a=input.next();
            char[] ch=a.toCharArray();
            char[] comp="ABCDEFG".toCharArray();
            int count=0;
            for(char c1:comp){
                int countChar=0;
                for(char c2:ch){
                    if(c1==c2) countChar++;
                }
                if(countChar<m) count+=m-countChar;
            }
            System.out.println(count);
        }
    }
}
