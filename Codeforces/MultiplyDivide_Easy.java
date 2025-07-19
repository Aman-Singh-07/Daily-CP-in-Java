// https://codeforces.com/problemset/problem/1374/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int count2=0;
            int count3=0;
            long n=input.nextLong();
            while(n%2==0){
                n/=2;
                count2++;
            }
            while(n%3==0){
                n/=3;
                count3++;
            }
            if(n!=1 || count2>count3){
                System.out.println(-1);
            }
            else{
                System.out.println(2*count3-count2);
            }
        }
    }
}
