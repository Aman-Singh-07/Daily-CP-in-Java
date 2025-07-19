// https://codeforces.com/problemset/problem/1283/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int h=input.nextInt();
            int m=input.nextInt();
            System.out.println((23-h)*60+(60-m));
        }
    }
}
