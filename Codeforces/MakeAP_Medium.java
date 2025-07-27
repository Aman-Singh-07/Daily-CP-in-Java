// https://codeforces.com/problemset/problem/1624/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            long c=input.nextLong();
            boolean isTrue=false;
            if((a+c)%2==0){
                long b1=(a+c)/2;
                if(b1%b==0) isTrue=true;
            }
            long a1=(2*b-c);
            if(a1>0 && a1%a==0) isTrue=true;
            
            long c1=(2*b-a);
            if(c1>0 && c1%c==0) isTrue=true;
            
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
