// https://codeforces.com/problemset/problem/935/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        int x=n/2;
        int i=1;
        while(n>=x && (n-1!=0)){
            if((n-1)%i==0) count++;
            n--;
            i++;
        }
        System.out.println(count);
    }
}
