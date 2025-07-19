// https://codeforces.com/problemset/problem/313/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextInt();
        if(n>=0) System.out.println(n);
        else if(n<0){
            long last=n/10;
            long secondLast=(n/100)*10+n%10;
            System.out.println(Math.max(last,secondLast));
        }
    }
}
