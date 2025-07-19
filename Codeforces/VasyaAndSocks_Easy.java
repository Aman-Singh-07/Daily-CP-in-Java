// https://codeforces.com/problemset/problem/460/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int count=0;
        while(n>0){
            count++;     
            n--;
            if(count%m==0){
                n++;
            }
        }
        System.out.println(count);
    }
}
