// https://codeforces.com/problemset/problem/1551/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            System.out.println((n-((n-(n/3))/2)*2)+" "+(n-(n/3))/2);
        }
    }
}
