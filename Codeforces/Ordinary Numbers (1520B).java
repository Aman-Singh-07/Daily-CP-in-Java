// https://codeforces.com/problemset/problem/1520/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
           int n=input.nextInt();
           int count=0;
            for(int d=1;d<=9;d++){
                int num=d;
                while(num<=n){
                    count++;
                    num=num*10+d;
                }
            }
            System.out.println(count);
        }
    }
}
