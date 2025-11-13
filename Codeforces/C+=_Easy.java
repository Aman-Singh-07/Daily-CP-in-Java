// https://codeforces.com/problemset/problem/1368/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            int count=0;
            while(a<=c && b<=c){
                if(a<b) a+=b;
                else b+=a;
                count++;
            }
            System.out.println(count);
        }
    }
}
