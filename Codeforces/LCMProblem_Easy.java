// https://codeforces.com/problemset/problem/1389/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long m=input.nextLong();
            if(n==1) System.out.println(n+" "+m);
            else{
                if(n*2>m) System.out.println("-1 -1");
                else System.out.println(n+" "+(2*n));
            }
            
        }
    }
}
